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
            connection = new Connection("localhost", "transportdb-v2", "postgres", "postgres");
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
        if (applicationServices == null) {
            applicationServices = new ApplicationServices();
        }
        return applicationServices;
    }

    public static AssignedCarServices getAssignedCarServices() {
        if (assignedCarServices == null) {
            assignedCarServices = new AssignedCarServices();
        }
        return assignedCarServices;
    }

    public static CarBrandServices getCarBrandServices() {
        if (carBrandServices == null) {
            carBrandServices = new CarBrandServices();
        }
        return carBrandServices;
    }

    public static CarSituationServices getCarSituationServices() {
        if (carSituationServices == null) {
            carSituationServices = new CarSituationServices();
        }
        return carSituationServices;
    }

    public static CarSituationTypeServices getCarSituationTypeServices() {
        if (carSituationTypeServices == null) {
            carSituationTypeServices = new CarSituationTypeServices();
        }
        return carSituationTypeServices;
    }

    public static CategoryServices getCategoryServices() {
        if (categoryServices == null) {
            categoryServices = new CategoryServices();
        }
        return categoryServices;
    }

    public static CountryServices getCountryServices() {
        if (countryServices == null) {
            countryServices = new CountryServices();
        }
        return countryServices;
    }

    public static DriverServices getDriverServices() {
        if (driverServices == null) {
            driverServices = new DriverServices();
        }
        return driverServices;
    }

    public static DriverSituationServices getDriverSituationServices() {
        if (driverSituationServices == null) {
            driverSituationServices = new DriverSituationServices();
        }
        return driverSituationServices;
    }

    public static DriverSituationTypeServices getDriverSituationTypeServices() {
        if (driverSituationTypeServices == null) {
            driverSituationTypeServices = new DriverSituationTypeServices();
        }
        return driverSituationTypeServices;
    }

    public static GroupsServices getGroupsServices() {
        if (groupsServices == null) {
            groupsServices = new GroupsServices();
        }
        return groupsServices;
    }

    public static InsideCarSituationServices getInsideCarSituationServices() {
        if (insideCarSituationServices == null) {
            insideCarSituationServices = new InsideCarSituationServices();
        }
        return insideCarSituationServices;
    }

    public static InsideDriverSituationServices getInsideDriverSituationServices() {
        if (insideDriverSituationServices == null) {
            insideDriverSituationServices = new InsideDriverSituationServices();
        }
        return insideDriverSituationServices;
    }

    public static ModificationServices getModificationServices() {
        if (modificationServices == null) {
            modificationServices = new ModificationServices();
        }
        return modificationServices;
    }

    public static ModificationTypeServices getModificationTypeServices() {
        if (modificationTypeServices == null) {
            modificationTypeServices = new ModificationTypeServices();
        }
        return modificationTypeServices;
    }

    public static ProgrammingServices getProgrammingServices() {
        if (programmingServices == null) {
            programmingServices = new ProgrammingServices();
        }
        return programmingServices;
    }

    public static ProgrammingTypeServices getProgrammingTypeServices() {
        if (programmingTypeServices == null) {
            programmingTypeServices = new ProgrammingTypeServices();
        }
        return programmingTypeServices;
    }

    public static RoadMapServices getRoadMapServices() {
        if (roadMapServices == null) {
            roadMapServices = new RoadMapServices();
        }
        return roadMapServices;
    }
}
