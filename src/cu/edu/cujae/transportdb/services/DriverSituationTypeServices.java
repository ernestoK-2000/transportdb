package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.CountryDto;
import cu.edu.cujae.transportdb.dto.DriverSituationTypeDto;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DriverSituationTypeServices extends AbstractServices<DriverSituationTypeDto> {

    public DriverSituationTypeServices() {
        super("situation_d");
    }

    @Override
    protected DriverSituationTypeDto createDto(ResultSet resultSet) throws SQLException {
        return new DriverSituationTypeDto(resultSet.getString(1), resultSet.getInt(2));
    }

    public void insertDriverSituationType(DriverSituationTypeDto driverSituationTypeDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, driverSituationTypeDto.getIdDriverSituationType());
        preparedFunction.setString(2, driverSituationTypeDto.getDriverSituationType());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
