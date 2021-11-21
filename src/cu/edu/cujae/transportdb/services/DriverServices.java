package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.DriverDto;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DriverServices extends AbstractServices<DriverDto> {

    public DriverServices() {
        super("driver");
    }

    @Override
    protected DriverDto createDto(ResultSet resultSet) throws SQLException {
        return new DriverDto(resultSet.getInt(1),
                resultSet.getString(2),
                resultSet.getString(3),
                resultSet.getString(4),
                resultSet.getString(5),
                resultSet.getInt(6));
    }

    public void insertDriver(DriverDto driverDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?, ?, ?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, driverDto.getIdDriver());
        preparedFunction.setString(2, driverDto.getDni());
        preparedFunction.setString(3, driverDto.getDriverName());
        preparedFunction.setString(4, driverDto.getDriverSurname());
        preparedFunction.setString(5, driverDto.getDriverAddress());
        preparedFunction.setInt(6, driverDto.getIdCategory());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
