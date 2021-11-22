package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.CountryDto;
import cu.edu.cujae.transportdb.dto.ProgrammingDto;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class ProgrammingServices extends AbstractServices<ProgrammingDto> {

    public ProgrammingServices() {
        super("programming");
    }

    @Override
    protected ProgrammingDto createDto(ResultSet resultSet) throws SQLException {
        return new ProgrammingDto(resultSet.getDate(2),
                resultSet.getDate(3),
                resultSet.getString(4),
                resultSet.getInt(1),
                resultSet.getInt(5),
                resultSet.getInt(6),
                resultSet.getInt(7));
    }

    public void insertProgramming(ProgrammingDto programmingDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?, ?, ?, ?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, programmingDto.getIdProgramming());
        preparedFunction.setTime(2, (Time) programmingDto.getStartTime());
        preparedFunction.setTime(3, (Time) programmingDto.getEndTime());
        preparedFunction.setString(4, programmingDto.getPickUpPlace());
        preparedFunction.setInt(5, programmingDto.getIdProgrammingType());
        preparedFunction.setInt(6, programmingDto.getIdApplication());
        preparedFunction.setInt(7, programmingDto.getIdModification());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }

    public void updateProgramming(ProgrammingDto programmingDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_update(?, ?, ?, ?, ?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, programmingDto.getIdProgramming());
        preparedFunction.setTime(2, (Time) programmingDto.getStartTime());
        preparedFunction.setTime(3, (Time) programmingDto.getEndTime());
        preparedFunction.setString(4, programmingDto.getPickUpPlace());
        preparedFunction.setInt(5, programmingDto.getIdProgrammingType());
        preparedFunction.setInt(6, programmingDto.getIdApplication());
        preparedFunction.setInt(7, programmingDto.getIdModification());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
