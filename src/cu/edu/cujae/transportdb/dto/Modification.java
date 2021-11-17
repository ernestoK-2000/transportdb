package cu.edu.cujae.transportdb.dto;

import java.util.Calendar;

public class Modification {
    private final String idModification;
    private Calendar date;
    private Object newValue;
    private String idModificationType;
    private String idGroups;

    public Modification(String idModification, Calendar date, Object newValue, String idModificationType, String idGroups) {
        this.idModification = idModification;
        this.date = date;
        this.newValue = newValue;
        this.idModificationType = idModificationType;
        this.idGroups = idGroups;
    }

    public String getIdModification() {
        return idModification;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Object getNewValue() {
        return newValue;
    }

    public void setNewValue(Object newValue) {
        this.newValue = newValue;
    }

    public String getIdModificationType() {
        return idModificationType;
    }

    public void setIdModificationType(String idModificationType) {
        this.idModificationType = idModificationType;
    }

    public String getIdGroups() {
        return idGroups;
    }

    public void setIdGroups(String idGroups) {
        this.idGroups = idGroups;
    }
}
