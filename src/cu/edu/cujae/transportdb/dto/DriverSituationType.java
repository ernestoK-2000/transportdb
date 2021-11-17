package cu.edu.cujae.transportdb.dto;

public class DriverSituationType {
    private String driverSituationType;
    private final String idDriverSituationType;

    public DriverSituationType(String driverSituationType, String idDriverSituationType) {
        this.driverSituationType = driverSituationType;
        this.idDriverSituationType = idDriverSituationType;
    }

    public String getDriverSituationType() {
        return driverSituationType;
    }

    public void setDriverSituationType(String driverSituationType) {
        this.driverSituationType = driverSituationType;
    }

    public String getIdDriverSituationType() {
        return idDriverSituationType;
    }
}
