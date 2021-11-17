package cu.edu.cujae.transportdb.dto;

public class CarSituationType {
    private final String idCarSituationType;
    private String situationType;

    public CarSituationType(String idCarSituationType, String situationType) {
        this.idCarSituationType = idCarSituationType;
        this.situationType = situationType;
    }

    public String getIdCarSituationType() {
        return idCarSituationType;
    }

    public String getSituationType() {
        return situationType;
    }

    public void setSituationType(String situationType) {
        this.situationType = situationType;
    }
}
