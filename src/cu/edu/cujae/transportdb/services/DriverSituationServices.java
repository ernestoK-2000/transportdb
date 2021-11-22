package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.CategoryDto;
import cu.edu.cujae.transportdb.dto.DriverSituationDto;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DriverSituationServices extends AbstractServices<DriverSituationDto> {


    public DriverSituationServices() {
        super("driver_situation");
    }

    @Override
    protected DriverSituationDto createDto(ResultSet resultSet) throws SQLException {
        return new DriverSituationDto(resultSet.getInt(1),
                resultSet.getDate(2),
                resultSet.getInt(3),
                resultSet.getInt(4));
    }

    public void insertDriverSituation(DriverSituationDto driverSituationDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, driverSituationDto.getIdDriverSituation());
        preparedFunction.setDate(2, (Date) driverSituationDto.getDate());
        preparedFunction.setInt(3, driverSituationDto.getIdDriverSituationType());
        preparedFunction.setInt(4, driverSituationDto.getIdDriver());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }

    public void updateDriverSituation(DriverSituationDto driverSituationDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_update(?, ?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, driverSituationDto.getIdDriverSituation());
        preparedFunction.setDate(2, (Date) driverSituationDto.getDate());
        preparedFunction.setInt(3, driverSituationDto.getIdDriverSituationType());
        preparedFunction.setInt(4, driverSituationDto.getIdDriver());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
