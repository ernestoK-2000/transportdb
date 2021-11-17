package cu.edu.cujae.transportdb.dto;

public class Driver {
    private final String idDriver;
    private String driverName;
    private String driver_surname;
    private String idCategory;

    public Driver(String idDriver, String driverName, String driver_surname, String idCategory) {
        this.idDriver = idDriver;
        this.driverName = driverName;
        this.driver_surname = driver_surname;
        this.idCategory = idCategory;
    }

    public String getIdDriver() {
        return idDriver;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriver_surname() {
        return driver_surname;
    }

    public void setDriver_surname(String driver_surname) {
        this.driver_surname = driver_surname;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }
}
