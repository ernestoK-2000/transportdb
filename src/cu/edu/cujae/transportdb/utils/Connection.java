package cu.edu.cujae.transportdb.utils;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static java.sql.Connection connection;

    public Connection(String serverAddress, String database, String user, String pass) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://" + serverAddress + ":5433/" + database;
        connection = DriverManager.getConnection(url, user, pass);
    }

    public java.sql.Connection getConnection() {
        return connection;
    }
}
