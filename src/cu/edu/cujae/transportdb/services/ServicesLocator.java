package cu.edu.cujae.transportdb.services;

import cu.edu.cujae.transportdb.utils.Connection;

import java.sql.SQLException;

public class ServicesLocator {

    private static CarServices carServices;

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
}
