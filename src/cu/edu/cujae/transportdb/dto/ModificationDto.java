package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;
import java.util.Date;

public class ModificationDto {
    private final int idModification;
    private Date date;
    private Object newValue;
    private int idModificationType;
    private int idGroups;

    public ModificationDto(int idModification, Date date, Object newValue, int idModificationType, int idGroups) {
        this.idModification = idModification;
        this.date = date;
        this.newValue = newValue;
        this.idModificationType = idModificationType;
        this.idGroups = idGroups;
    }

    public int getIdModification() {
        return idModification;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Object getNewValue() {
        return newValue;
    }

    public void setNewValue(Object newValue) {
        this.newValue = newValue;
    }

    public int getIdModificationType() {
        return idModificationType;
    }

    public void setIdModificationType(int idModificationType) {
        this.idModificationType = idModificationType;
    }

    public int getIdGroups() {
        return idGroups;
    }

    public void setIdGroups(int idGroups) {
        this.idGroups = idGroups;
    }
}
