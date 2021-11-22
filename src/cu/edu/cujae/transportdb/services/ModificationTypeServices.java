package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.CountryDto;
import cu.edu.cujae.transportdb.dto.ModificationTypeDto;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModificationTypeServices extends AbstractServices<ModificationTypeDto> {

    public ModificationTypeServices() {
        super("modification_type");
    }

    @Override
    protected ModificationTypeDto createDto(ResultSet resultSet) throws SQLException {
        return new ModificationTypeDto(resultSet.getInt(1), resultSet.getString(2));
    }

    public void insertModificationType(ModificationTypeDto modificationTypeDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, modificationTypeDto.getIdModificationType());
        preparedFunction.setString(2, modificationTypeDto.getModification());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }

    public void updateModificationType(ModificationTypeDto modificationTypeDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_update(?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, modificationTypeDto.getIdModificationType());
        preparedFunction.setString(2, modificationTypeDto.getModification());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }

    public int getIdModificationType(String modificationType) throws SQLException{
        java.sql.Connection connection = ServicesLocator.getConnection();
        String sql = "select id_modification_type from modification_type where modification_type = ?";
        PreparedStatement statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        statement.setString(1, modificationType);
        statement.execute();
        ResultSet result = statement.getResultSet();
        result.first();
        return result.getInt(1);
    }
}
