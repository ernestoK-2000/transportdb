package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.CountryDto;
import cu.edu.cujae.transportdb.dto.ProgrammingTypeDto;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class ProgrammingTypeServices extends AbstractServices<ProgrammingTypeDto> {

    public ProgrammingTypeServices() {
        super("programming_type");
    }

    @Override
    protected ProgrammingTypeDto createDto(ResultSet resultSet) throws SQLException {
        return new ProgrammingTypeDto(resultSet.getInt(1),
                resultSet.getString(4),
                resultSet.getDate(2),
                resultSet.getFloat(3));
    }

    public void insertProgrammingType(ProgrammingTypeDto programmingTypeDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, programmingTypeDto.getIdProgrammingType());
        preparedFunction.setTime(2, (Time) programmingTypeDto.getDelayTime());
        preparedFunction.setFloat(3, programmingTypeDto.getKmToTravel());
        preparedFunction.setString(4, programmingTypeDto.getProgrammingType());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
