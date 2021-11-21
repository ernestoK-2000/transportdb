package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.CarSituationTypeDto;
import cu.edu.cujae.transportdb.dto.CategoryDto;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryServices extends AbstractServices<CategoryDto> {

    public CategoryServices() {
        super("category");
    }

    @Override
    protected CategoryDto createDto(ResultSet resultSet) throws SQLException {
        return new CategoryDto(resultSet.getInt(1), resultSet.getString(2));
    }

    public void inserCategory(CategoryDto categoryDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, categoryDto.getIdCategory());
        preparedFunction.setString(2, categoryDto.getCategory());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
