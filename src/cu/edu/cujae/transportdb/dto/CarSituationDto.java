package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;
import java.util.Date;

public class CarSituationDto {
    private final int idCarSituation;
    private Date date;
    private int idCarSituationType;
    private int idCar;

    public CarSituationDto(int idCarSituation, Date date, int idCarSituationType, int idCar) {
        this.date = date;
        this.idCarSituationType = idCarSituationType;
        this.idCar = idCar;
        this.idCarSituation = idCarSituation;
    }

    public Date getDate() {
        return date;
    }

    public int getIdCarSituation() {
        return idCarSituation;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdCarSituationType() {
        return idCarSituationType;
    }

    public void setIdCarSituationType(int idCarSituationType) {
        this.idCarSituationType = idCarSituationType;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }
}
