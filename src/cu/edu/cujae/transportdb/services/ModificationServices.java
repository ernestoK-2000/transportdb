package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.CountryDto;
import cu.edu.cujae.transportdb.dto.ModificationDto;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        connection.setAutoCommit(false);
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
}
