package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;
import java.util.Date;

public class ProgrammingDto {
    private Date startTime;
    private Date endTime;
    private String pickUpPlace;
    private final int idProgramming;
    private int idProgrammingType;
    private int idApplication;
    private int idModification;

    public ProgrammingDto(Date startTime, Date endTime, String pickUpPlace, int idProgramming, int idProgrammingType, int idApplication, int idModification) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.pickUpPlace = pickUpPlace;
        this.idProgramming = idProgramming;
        this.idProgrammingType = idProgrammingType;
        this.idApplication = idApplication;
        this.idModification = idModification;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getPickUpPlace() {
        return pickUpPlace;
    }

    public void setPickUpPlace(String pickUpPlace) {
        this.pickUpPlace = pickUpPlace;
    }

    public int getIdProgramming() {
        return idProgramming;
    }

    public int getIdProgrammingType() {
        return idProgrammingType;
    }

    public void setIdProgrammingType(int idProgrammingType) {
        this.idProgrammingType = idProgrammingType;
    }

    public int getIdApplication() {
        return idApplication;
    }

    public void setIdApplication(int idApplication) {
        this.idApplication = idApplication;
    }

    public int getIdModification() {
        return idModification;
    }

    public void setIdModification(int idModification) {
        this.idModification = idModification;
    }
}
