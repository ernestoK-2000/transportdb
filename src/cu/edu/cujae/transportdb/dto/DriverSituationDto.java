package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;
import java.util.Date;

public class DriverSituationDto {
    private final int idDriverSituation;
    private Date date;
    private int idDriverSituationType;
    private int idDriver;

    public DriverSituationDto(int idDriverSituation, Date date, int idDriverSituationType, int idDriver) {
        this.idDriverSituation = idDriverSituation;
        this.date = date;
        this.idDriverSituationType = idDriverSituationType;
        this.idDriver = idDriver;
    }

    public int getIdDriverSituation() {
        return idDriverSituation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdDriverSituationType() {
        return idDriverSituationType;
    }

    public void setIdDriverSituationType(int idDriverSituationType) {
        this.idDriverSituationType = idDriverSituationType;
    }

    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }
}
