package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;
import java.util.Date;

public class ProgrammingTypeDto {
    private final int idProgrammingType;
    private String programmingType;
    private Date delayTime;
    private float kmToTravel;

    public ProgrammingTypeDto(int idProgrammingType, String programmingType, Date delayTime, float kmToTravel) {
        this.idProgrammingType = idProgrammingType;
        this.programmingType = programmingType;
        this.delayTime = delayTime;
        this.kmToTravel = kmToTravel;
    }

    public int getIdProgrammingType() {
        return idProgrammingType;
    }

    public String getProgrammingType() {
        return programmingType;
    }

    public void setProgrammingType(String programmingType) {
        this.programmingType = programmingType;
    }

    public Date getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Date delayTime) {
        this.delayTime = delayTime;
    }

    public float getKmToTravel() {
        return kmToTravel;
    }

    public void setKmToTravel(float kmToTravel) {
        this.kmToTravel = kmToTravel;
    }
}
