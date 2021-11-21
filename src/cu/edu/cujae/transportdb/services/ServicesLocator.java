package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.utils.Connection;

import java.sql.SQLException;

public class ServicesLocator {

    private static ApplicationServices applicationServices;
    private static AssignedCarServices assignedCarServices;
    private static CarBrandServices carBrandServices;
    private static CarServices carServices;
    private static CarSituationServices carSituationServices;
    private static CarSituationTypeServices carSituationTypeServices;
    private static CategoryServices categoryServices;
    private static CountryServices countryServices;
    private static DriverServices driverServices;
    private static DriverSituationServices driverSituationServices;
    private static DriverSituationTypeServices driverSituationTypeServices;
    private static GroupsServices groupsServices;
    private static InsideCarSituationServices insideCarSituationServices;
    private static InsideDriverSituationServices insideDriverSituationServices;
    private static ModificationServices modificationServices;
    private static ModificationTypeServices modificationTypeServices;
    private static ProgrammingServices programmingServices;
    private static ProgrammingTypeServices programmingTypeServices;
    private static RoadMapServices roadMapServices;

    private ServicesLocator(){}

    public static java.sql.Connection getConnection(){
        Connection connection = null;
        try {
            connection = new Connection("localhost", "transportdb", "postgres", "postgres");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection.getConnection();
    }



    public static CarServices getCarServices() {
        if (carServices == null) {
            carServices = new CarServices();
        }
        return carServices;
    }

    public static ApplicationServices getApplicationServices() {
        return applicationServices;
    }

    public static AssignedCarServices getAssignedCarServices() {
        return assignedCarServices;
    }

    public static CarBrandServices getCarBrandServices() {
        return carBrandServices;
    }

    public static CarSituationServices getCarSituationServices() {
        return carSituationServices;
    }

    public static CarSituationTypeServices getCarSituationTypeServices() {
        return carSituationTypeServices;
    }

    public static CategoryServices getCategoryServices() {
        return categoryServices;
    }

    public static CountryServices getCountryServices() {
        return countryServices;
    }

    public static DriverServices getDriverServices() {
        return driverServices;
    }

    public static DriverSituationServices getDriverSituationServices() {
        return driverSituationServices;
    }

    public static DriverSituationTypeServices getDriverSituationTypeServices() {
        return driverSituationTypeServices;
    }

    public static GroupsServices getGroupsServices() {
        return groupsServices;
    }

    public static InsideCarSituationServices getInsideCarSituationServices() {
        return insideCarSituationServices;
    }

    public static InsideDriverSituationServices getInsideDriverSituationServices() {
        return insideDriverSituationServices;
    }

    public static ModificationServices getModificationServices() {
        return modificationServices;
    }

    public static ModificationTypeServices getModificationTypeServices() {
        return modificationTypeServices;
    }

    public static ProgrammingServices getProgrammingServices() {
        return programmingServices;
    }

    public static ProgrammingTypeServices getProgrammingTypeServices() {
        return programmingTypeServices;
    }

    public static RoadMapServices getRoadMapServices() {
        return roadMapServices;
    }
}
