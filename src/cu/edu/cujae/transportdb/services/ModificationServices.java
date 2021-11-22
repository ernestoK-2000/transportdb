package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.CountryDto;
import cu.edu.cujae.transportdb.dto.ModificationDto;

import java.sql.*;

public class ModificationServices extends AbstractServices<ModificationDto> {

    public ModificationServices() {
        super("modification");
    }

    @Override
    protected ModificationDto createDto(ResultSet resultSet) throws SQLException {
        return new ModificationDto(resultSet.getInt(1),
                resultSet.getDate(2),
                resultSet.getObject(3),
                resultSet.getInt(4),
                resultSet.getInt(5));
    }

    public void insertModification(ModificationDto modificationDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?, ?, ?, ?)}";
        //connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, modificationDto.getIdModification());
        preparedFunction.setDate(2, (Date) modificationDto.getDate());
        preparedFunction.setString(3, modificationDto.getNewValue().toString());
        preparedFunction.setInt(4, modificationDto.getIdModificationType());
        preparedFunction.setInt(5, modificationDto.getIdGroups());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }

    public void updateModification(ModificationDto modificationDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_update(?, ?, ?, ?, ?)}";
        //connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, modificationDto.getIdModification());
        preparedFunction.setDate(2, (Date) modificationDto.getDate());
        preparedFunction.setString(3, modificationDto.getNewValue().toString());
        preparedFunction.setInt(4, modificationDto.getIdModificationType());
        preparedFunction.setInt(5, modificationDto.getIdGroups());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }

    public int getIdModification(Date date, String newValue, int idModificationType, int idGroups) throws SQLException{
        java.sql.Connection connection = ServicesLocator.getConnection();
        String sql = "select id_modification from modification where (date = ? and new_value = ? and id_modification_type = ? and id_groups = ?)";
        PreparedStatement statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        statement.setDate(1, date);
        statement.setString(2, newValue);
        statement.setInt(3, idModificationType);
        statement.setInt(4, idGroups);
        statement.execute();
        ResultSet result = statement.getResultSet();
        result.first();
        return result.getInt(1);
    }
}
