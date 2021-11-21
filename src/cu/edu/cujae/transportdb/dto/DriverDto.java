package cu.edu.cujae.transportdb.dto;

public class DriverDto {
    private final int idDriver;
    private String driverName;
    private String driverSurname;
    private int idCategory;
    private String driverAddress;
    private String dni;

    public DriverDto(int idDriver, String dni, String driverName, String driverSurname, String driverAddress, int idCategory) {
        this.idDriver = idDriver;
        this.dni = dni;
        this.driverName = driverName;
        this.driverSurname = driverSurname;
        this.driverAddress = driverAddress;
        this.idCategory = idCategory;
    }

    public int getIdDriver() {
        return idDriver;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverSurname() {
        return driverSurname;
    }

    public void setDriverSurname(String driverSurname) {
        this.driverSurname = driverSurname;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDriverAddress() {
        return driverAddress;
    }

    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress;
    }
}
