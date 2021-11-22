package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.CategoryDto;
import cu.edu.cujae.transportdb.dto.CountryDto;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryServices extends AbstractServices<CountryDto> {

    public CountryServices() {
        super("country");
    }

    @Override
    protected CountryDto createDto(ResultSet resultSet) throws SQLException {
        return new CountryDto(resultSet.getInt(1), resultSet.getString(2));
    }

    public void insertCountry(CountryDto countryDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, countryDto.getIdCountry());
        preparedFunction.setString(2, countryDto.getCountry());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }

    public void updateCountry(CountryDto countryDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_update(?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, countryDto.getIdCountry());
        preparedFunction.setString(2, countryDto.getCountry());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
