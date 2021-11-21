package cu.edu.cujae.transportdb.dto;

public class DriverSituationTypeDto {
    private String driverSituationType;
    private final int idDriverSituationType;

    public DriverSituationTypeDto(String driverSituationType, int idDriverSituationType) {
        this.driverSituationType = driverSituationType;
        this.idDriverSituationType = idDriverSituationType;
    }

    public String getDriverSituationType() {
        return driverSituationType;
    }

    public void setDriverSituationType(String driverSituationType) {
        this.driverSituationType = driverSituationType;
    }

    public int getIdDriverSituationType() {
        return idDriverSituationType;
    }
}
