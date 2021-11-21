package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;
import java.util.Date;

public class AssignedCarDto {
    private Date date;
    private final int idAssignedCar;
    private int idCopilot;
    private int idDriver;
    private int idCar;

    public AssignedCarDto(Date date, int idAssignedCar, int idCopilot, int idDriver, int idCar) {
        this.date = date;
        this.idAssignedCar = idAssignedCar;
        this.idCopilot = idCopilot;
        this.idDriver = idDriver;
        this.idCar = idCar;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdAssignedCar() {
        return idAssignedCar;
    }

    public int getIdCopilot() {
        return idCopilot;
    }

    public void setIdCopilot(int idCopilot) {
        this.idCopilot = idCopilot;
    }

    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }


}
