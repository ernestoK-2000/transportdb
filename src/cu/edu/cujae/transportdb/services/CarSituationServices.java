package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.ApplicationDto;
import cu.edu.cujae.transportdb.dto.CarSituationDto;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarSituationServices extends AbstractServices<CarSituationDto> {

    public CarSituationServices() {
        super("car_situation");
    }

    @Override
    protected CarSituationDto createDto(ResultSet resultSet) throws SQLException {
        return new CarSituationDto(resultSet.getInt(1),
                resultSet.getDate(2),
                resultSet.getInt(3),
                resultSet.getInt(4));
    }

    public void insertCarSituation(CarSituationDto carSituationDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, carSituationDto.getIdCarSituation());
        preparedFunction.setDate(2, (Date) carSituationDto.getDate());
        preparedFunction.setInt(3, carSituationDto.getIdCarSituationType());
        preparedFunction.setInt(4, carSituationDto.getIdCar());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }

    public void updateCarSituation(CarSituationDto carSituationDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_update(?, ?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, carSituationDto.getIdCarSituation());
        preparedFunction.setDate(2, (Date) carSituationDto.getDate());
        preparedFunction.setInt(3, carSituationDto.getIdCarSituationType());
        preparedFunction.setInt(4, carSituationDto.getIdCar());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
