package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;

public class DriverSituationDto {
    private final String idDriverSituation;
    private Calendar date;
    private String idDriverSituationType;
    private String idDriver;

    public DriverSituationDto(String idDriverSituation, Calendar date, String idDriverSituationType, String idDriver) {
        this.idDriverSituation = idDriverSituation;
        this.date = date;
        this.idDriverSituationType = idDriverSituationType;
        this.idDriver = idDriver;
    }

    public String getIdDriverSituation() {
        return idDriverSituation;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getIdDriverSituationType() {
        return idDriverSituationType;
    }

    public void setIdDriverSituationType(String idDriverSituationType) {
        this.idDriverSituationType = idDriverSituationType;
    }

    public String getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(String idDriver) {
        this.idDriver = idDriver;
    }
}
