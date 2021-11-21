package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.ApplicationDto;
import cu.edu.cujae.transportdb.dto.CarDto;

import java.sql.*;
import java.util.LinkedList;

public class CarServices extends AbstractServices<CarDto>{

    public CarServices() {
        super("car");
    }

    @Override
    protected CarDto createDto(ResultSet resultSet) throws SQLException{
        return new CarDto(resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getInt(4),
                resultSet.getFloat(5));
    }

    public void insertCar(CarDto carDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?, ?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, carDto.getIdCar());
        preparedFunction.setString(2, carDto.getCarNumber());
        preparedFunction.setString(3, carDto.getCarBrand());
        preparedFunction.setInt(4, carDto.getCarSeats());
        preparedFunction.setFloat(5, carDto.getKmAvailable());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
