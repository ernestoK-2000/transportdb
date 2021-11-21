package cu.edu.cujae.transportdb.dto;

import java.util.Date;

public class ApplicationDto {
    private final int idApplication;
    private boolean accepted;
    private int idGroups;
    private Date date;

    public ApplicationDto(int idApplication, boolean accepted, Date date, int idGroups) {
        this.idApplication = idApplication;
        this.accepted = accepted;
        this.idGroups = idGroups;
        this.date = date;
    }

    public int getIdApplication() {
        return idApplication;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public int getIdGroups() {
        return idGroups;
    }

    public void setIdGroups(int idGroups) {
        this.idGroups = idGroups;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
