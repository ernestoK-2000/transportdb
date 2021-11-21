package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.CountryDto;
import cu.edu.cujae.transportdb.dto.InsideDriverSituationDto;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsideDriverSituationServices extends AbstractServices<InsideDriverSituationDto> {

    public InsideDriverSituationServices() {
        super("inside_driver_situation");
    }

    @Override
    protected InsideDriverSituationDto createDto(ResultSet resultSet) throws SQLException {
        return new InsideDriverSituationDto(resultSet.getInt(1),
                resultSet.getDate(3),
                resultSet.getDate(2));
    }

    public void insertInsideDriverSituation(InsideDriverSituationDto insideDriverSituationDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, insideDriverSituationDto.getIdDriverSituation());
        preparedFunction.setDate(2, (Date) insideDriverSituationDto.getReturnDate());
        preparedFunction.setDate(3, (Date) insideDriverSituationDto.getDate());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
