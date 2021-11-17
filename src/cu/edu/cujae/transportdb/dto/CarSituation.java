package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;

public class CarSituation {
    private final String idCarSituation;
    private Calendar date;
    private String idCarSituationType;
    private String idCar;

    public CarSituation(String idCarSituation, Calendar date, String idCarSituationType, String idCar) {
        this.date = date;
        this.idCarSituationType = idCarSituationType;
        this.idCar = idCar;
        this.idCarSituation = idCarSituation;
    }

    public Calendar getDate() {
        return date;
    }

    public String getIdCarSituation() {
        return idCarSituation;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getIdCarSituationType() {
        return idCarSituationType;
    }

    public void setIdCarSituationType(String idCarSituationType) {
        this.idCarSituationType = idCarSituationType;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }
}
