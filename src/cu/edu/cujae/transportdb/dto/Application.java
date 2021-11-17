package cu.edu.cujae.transportdb.dto;

public class Application {
    private final String idApplication;
    private boolean accepted;
    private String idGroups;

    public Application(String idApplication, boolean accepted, String idGroups) {
        this.idApplication = idApplication;
        this.accepted = accepted;
        this.idGroups = idGroups;
    }

    public String getIdApplication() {
        return idApplication;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public String getIdGroups() {
        return idGroups;
    }

    public void setIdGroups(String idGroups) {
        this.idGroups = idGroups;
    }
}
