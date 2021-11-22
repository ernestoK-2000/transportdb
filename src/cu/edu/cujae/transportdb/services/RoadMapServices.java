package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.dto.CountryDto;
import cu.edu.cujae.transportdb.dto.RoadmapDto;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RoadMapServices extends AbstractServices<RoadmapDto> {

    public RoadMapServices() {
        super("roadmap");
    }

    @Override
    protected RoadmapDto createDto(ResultSet resultSet) throws SQLException {
        return new RoadmapDto(resultSet.getInt(1),
                resultSet.getInt(2),
                resultSet.getInt(3),
                resultSet.getInt(4),
                resultSet.getInt(5));
    }

    public void insertRoadMap(RoadmapDto roadmapDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_insert(?, ?, ?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, roadmapDto.getIdRoadmap());
        preparedFunction.setInt(2, roadmapDto.getInitialKm());
        preparedFunction.setInt(3, roadmapDto.getFinalKm());
        preparedFunction.setInt(4, roadmapDto.getIdAssignedCar());
        preparedFunction.setInt(5, roadmapDto.getIdProgramming());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }

    public void updateRoadMap(RoadmapDto roadmapDto) throws SQLException{

        java.sql.Connection connection = ServicesLocator.getConnection();

        String sqlFunction = "{call " + tableName + "_update(?, ?, ?, ?, ?)}";
        connection.setAutoCommit(false);
        CallableStatement preparedFunction = connection.prepareCall(sqlFunction);
        preparedFunction.setInt(1, roadmapDto.getIdRoadmap());
        preparedFunction.setFloat(2, roadmapDto.getInitialKm());
        preparedFunction.setFloat(3, roadmapDto.getFinalKm());
        preparedFunction.setInt(4, roadmapDto.getIdAssignedCar());
        preparedFunction.setInt(5, roadmapDto.getIdProgramming());
        preparedFunction.execute();

        preparedFunction.close();
        connection.close();
    }
}
