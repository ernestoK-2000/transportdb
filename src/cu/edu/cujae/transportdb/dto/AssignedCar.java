package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;

public class AssignedCar {
    private Calendar date;
    private final String idAssignedCar;
    private String idCopilot;
    private String idDriver;

    public AssignedCar(Calendar date, String idAssignedCar, String idCopilot, String idDriver) {
        this.date = date;
        this.idAssignedCar = idAssignedCar;
        this.idCopilot = idCopilot;
        this.idDriver = idDriver;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getIdAssignedCar() {
        return idAssignedCar;
    }

    public String getIdCopilot() {
        return idCopilot;
    }

    public void setIdCopilot(String idCopilot) {
        this.idCopilot = idCopilot;
    }

    public String getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(String idDriver) {
        this.idDriver = idDriver;
    }
}
