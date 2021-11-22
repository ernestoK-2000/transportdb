package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.CountryDto;
import cu.edu.cujae.transportdb.dto.InsideCarSituationDto;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsideCarSituationServices extends AbstractServices<InsideCarSituationDto> {

    public InsideCarSituationServices() {
        super("inside_car_situation");
    }

    @Override
    protected InsideCarSituationDto createDto(ResultSet resultSet) throws SQLException {
        return new InsideCarSituationDto(resultSet.getInt(1),
                resultSet.getDate(2),
                resultSet.getDate(3));
    }

    public void insertInsideCarSituation(InsideCarSituationDto insideCarSituationDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, insideCarSituationDto.getIdCarSituation());
        preparedFunction.setDate(2, (Date) insideCarSituationDto.getDate());
        preparedFunction.setDate(3, (Date) insideCarSituationDto.getReturnDate());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }

    public void updateInsideCarSituation(InsideCarSituationDto insideCarSituationDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_update(?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, insideCarSituationDto.getIdCarSituation());
        preparedFunction.setDate(2, (Date) insideCarSituationDto.getDate());
        preparedFunction.setDate(3, (Date) insideCarSituationDto.getReturnDate());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
