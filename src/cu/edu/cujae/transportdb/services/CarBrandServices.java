package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.ApplicationDto;
import cu.edu.cujae.transportdb.dto.CarBrandDto;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarBrandServices extends AbstractServices<CarBrandDto> {

    public CarBrandServices() {
        super("car_brand");
    }

    @Override
    protected CarBrandDto createDto(ResultSet resultSet) throws SQLException {
        return new CarBrandDto(resultSet.getInt(1), resultSet.getString(2));
    }

    public void insertCarBrand(CarBrandDto carBrandDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, carBrandDto.getIdBrand());
        preparedFunction.setString(2, carBrandDto.getBrand());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }

    public void updateCarBrand(CarBrandDto carBrandDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_update(?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, carBrandDto.getIdBrand());
        preparedFunction.setString(2, carBrandDto.getBrand());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
