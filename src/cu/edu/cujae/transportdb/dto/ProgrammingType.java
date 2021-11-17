package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;

public class ProgrammingType {
    private final String idProgrammingType;
    private String programmingType;
    private Calendar delayTime;
    private float kmToTravel;

    public ProgrammingType(String idProgrammingType, String programmingType, Calendar delayTime, float kmToTravel) {
        this.idProgrammingType = idProgrammingType;
        this.programmingType = programmingType;
        this.delayTime = delayTime;
        this.kmToTravel = kmToTravel;
    }

    public String getIdProgrammingType() {
        return idProgrammingType;
    }

    public String getProgrammingType() {
        return programmingType;
    }

    public void setProgrammingType(String programmingType) {
        this.programmingType = programmingType;
    }

    public Calendar getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Calendar delayTime) {
        this.delayTime = delayTime;
    }

    public float getKmToTravel() {
        return kmToTravel;
    }

    public void setKmToTravel(float kmToTravel) {
        this.kmToTravel = kmToTravel;
    }
}
