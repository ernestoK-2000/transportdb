package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.CountryDto;
import cu.edu.cujae.transportdb.dto.GroupsDto;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GroupsServices extends AbstractServices<GroupsDto> {

    public GroupsServices() {
        super("groups");
    }

    @Override
    protected GroupsDto createDto(ResultSet resultSet) throws SQLException {
        return new GroupsDto(resultSet.getInt(1),
                resultSet.getInt(2),
                resultSet.getInt(3));
    }

    public void insertGroups(GroupsDto groupsDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, groupsDto.getIdGroups());
        preparedFunction.setInt(2, groupsDto.getAmountOfPeople());
        preparedFunction.setInt(3, groupsDto.getIdCountry());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
