package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.ApplicationDto;
import cu.edu.cujae.transportdb.dto.AssignedCarDto;
import cu.edu.cujae.transportdb.dto.CarDto;

import java.sql.*;
import java.util.LinkedList;

public class AssignedCarServices extends AbstractServices<AssignedCarDto>{


    public AssignedCarServices() {
        super("car");
    }

    @Override
    protected AssignedCarDto createDto(ResultSet resultSet) throws SQLException {
        return new AssignedCarDto(resultSet.getDate(2),
                resultSet.getInt(1),
                resultSet.getInt(5),
                resultSet.getInt(4),
                resultSet.getInt(3));
    }

    public void insertAssignedCar(AssignedCarDto assignedCarDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?, ?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, assignedCarDto.getIdAssignedCar());
        preparedFunction.setDate(2, (Date) assignedCarDto.getDate());
        preparedFunction.setInt(3, assignedCarDto.getIdCar());
        preparedFunction.setInt(4, assignedCarDto.getIdDriver());
        preparedFunction.setInt(5, assignedCarDto.getIdCopilot());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
