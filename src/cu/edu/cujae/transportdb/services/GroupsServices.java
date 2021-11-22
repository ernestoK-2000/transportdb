package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.CountryDto;
import cu.edu.cujae.transportdb.dto.GroupsDto;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
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
        //connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, groupsDto.getIdGroups());
        preparedFunction.setInt(2, groupsDto.getAmountOfPeople());
        preparedFunction.setInt(3, groupsDto.getIdCountry());
        preparedFunction.execute();
        System.out.println(sqlFunction);
        System.out.println(groupsDto.getIdGroups());
        System.out.println(groupsDto.getIdCountry());
        groupsDto.getAmountOfPeople();

        preparedFunction.close();
        connection.close();
    }

    public void updateGroups(GroupsDto groupsDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_update(?, ?, ?)}";
        //connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, groupsDto.getIdGroups());
        preparedFunction.setInt(2, groupsDto.getAmountOfPeople());
        preparedFunction.setInt(3, groupsDto.getIdCountry());
        preparedFunction.execute();

        System.out.println(groupsDto.getIdGroups());
        System.out.println(groupsDto.getAmountOfPeople());
        System.out.println(groupsDto.getIdCountry());

        preparedFunction.close();
        connection.close();
    }

    public int getIdGroup(int amountPeople, int idCountry) throws SQLException{
        java.sql.Connection connection = ServicesLocator.getConnection();
        String sql = "select id_groups from groups where amount_of_people = ? and id_country = ?";
        PreparedStatement statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        statement.setInt(1, amountPeople);
        statement.setInt(2, idCountry);
        statement.execute();
        ResultSet result = statement.getResultSet();
        result.first();
        return result.getInt(1);
    }
}
