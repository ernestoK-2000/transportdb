package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.ApplicationDto;
import cu.edu.cujae.transportdb.dto.CarSituationTypeDto;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarSituationTypeServices extends AbstractServices<CarSituationTypeDto> {

    public CarSituationTypeServices() {
        super("situation_c");
    }

    @Override
    protected CarSituationTypeDto createDto(ResultSet resultSet) throws SQLException {
        return new CarSituationTypeDto(resultSet.getInt(1), resultSet.getString(1));
    }

    public void insertCarSituationType(CarSituationTypeDto carSituationTypeDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, carSituationTypeDto.getIdCarSituationType());
        preparedFunction.setString(2, carSituationTypeDto.getSituationType());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }

    public void updateCarSituationType(CarSituationTypeDto carSituationTypeDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_update(?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, carSituationTypeDto.getIdCarSituationType());
        preparedFunction.setString(2, carSituationTypeDto.getSituationType());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
