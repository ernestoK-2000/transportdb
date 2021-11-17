package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.CarDto;

import java.sql.*;
import java.util.LinkedList;

public class CarServices {
    public LinkedList<CarDto> getAllCars() throws SQLException{
        LinkedList<CarDto> carList = new LinkedList<>();
        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{?= call select_all_car()}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.registerOutParameter(1, Types.OTHER);
        preparedFunction.execute();
        ResultSet resultSet = (ResultSet) preparedFunction.getObject(1);
        while(resultSet.next()){
            carList.add(createDto(resultSet));
        }

        resultSet.close();
        preparedFunction.close();
        connection.close();

        return carList;
    }

    private CarDto createDto(ResultSet resultSet) throws SQLException{
        return new CarDto(resultSet.getString(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getInt(4),
                resultSet.getFloat(5));
    }
}
