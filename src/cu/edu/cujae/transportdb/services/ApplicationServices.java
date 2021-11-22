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
        connection.setAutoCommit(false);
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
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, applicationDto.getIdApplication());
        preparedFunction.setBoolean(2, applicationDto.isAccepted());
        preparedFunction.setDate(3, (Date) applicationDto.getDate());
        preparedFunction.setInt(4, applicationDto.getIdGroups());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}

