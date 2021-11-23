package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.ApplicationDto;
import cu.edu.cujae.transportdb.dto.CarDto;

import java.sql.*;
import java.util.LinkedList;

public class ApplicationServices extends AbstractServices<ApplicationDto>{


    public ApplicationServices() {
        super("application");
    }

    @Override
    protected ApplicationDto createDto(ResultSet resultSet) throws SQLException{
        return new ApplicationDto(resultSet.getInt(1),
                resultSet.getBoolean(2),
                resultSet.getDate(3),
                resultSet.getInt(4));
    }

    public void insertApplication(ApplicationDto applicationDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?, ?, ?)}";
        //connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, applicationDto.getIdApplication());
        preparedFunction.setBoolean(2, applicationDto.isAccepted());
        preparedFunction.setDate(3, (Date) applicationDto.getDate());
        preparedFunction.setInt(4, applicationDto.getIdGroups());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }

    public void updateApplication(ApplicationDto applicationDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_update(?, ?, ?, ?)}";
        //connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, applicationDto.getIdApplication());
        preparedFunction.setBoolean(2, applicationDto.isAccepted());
        preparedFunction.setDate(3, (Date) applicationDto.getDate());
        preparedFunction.setInt(4, applicationDto.getIdGroups());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }

    public int getIdApplication(boolean accepted, Date date, int idGroups) throws SQLException{
        java.sql.Connection connection = ServicesLocator.getConnection();
        String sql = "select id_application from application where (accepted = ? and date = ? and id_groups = ?)";
        PreparedStatement statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        statement.setBoolean(1, accepted);
        statement.setDate(2, date);
        statement.setInt(3, idGroups);
        statement.execute();
        ResultSet result = statement.getResultSet();
        result.first();
        return result.getInt(1);
    }
}

