package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;

public class ProgrammingDto {
    private Calendar startTime;
    private Calendar endTime;
    private String pickUpPlace;
    private final String idProgramming;
    private String idProgrammingType;

    public ProgrammingDto(Calendar startTime, Calendar endTime, String pickUpPlace, String idProgramming, String idProgrammingType) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.pickUpPlace = pickUpPlace;
        this.idProgramming = idProgramming;
        this.idProgrammingType = idProgrammingType;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public Calendar getEndTime() {
        return endTime;
    }

    public void setEndTime(Calendar endTime) {
        this.endTime = endTime;
    }

    public String getPickUpPlace() {
        return pickUpPlace;
    }

    public void setPickUpPlace(String pickUpPlace) {
        this.pickUpPlace = pickUpPlace;
    }

    public String getIdProgramming() {
        return idProgramming;
    }

    public String getIdProgrammingType() {
        return idProgrammingType;
    }

    public void setIdProgrammingType(String idProgrammingType) {
        this.idProgrammingType = idProgrammingType;
    }
}
