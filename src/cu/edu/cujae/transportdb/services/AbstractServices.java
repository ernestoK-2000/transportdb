package cu.edu.cujae.transportdb.services;

import java.sql.*;
import java.util.LinkedList;

public abstract class AbstractServices<T> {
    protected final String tableName;

    public AbstractServices(String tableName){
        this.tableName = tableName;
    }

    public LinkedList<T> getAllInfo() throws SQLException{
        LinkedList<T> dtoList = new LinkedList<>();
        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{?= call select_all_" + tableName + "()}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.registerOutParameter(1, Types.OTHER);
        preparedFunction.execute();
        ResultSet resultSet = (ResultSet) preparedFunction.getObject(1);
        while(resultSet.next()){
            dtoList.add(createDto(resultSet));
        }

        resultSet.close();
        preparedFunction.close();
        connection.close();

        return dtoList;
    }

    public void deleteRegister(int id) throws SQLException{
        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_delete(?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1,id);
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }




    protected abstract T createDto(ResultSet resultSet) throws SQLException;
}

