package cu.edu.cujae.transportdb.dto;

public class CarSituationTypeDto {
    private final int idCarSituationType;
    private String situationType;

    public CarSituationTypeDto(int idCarSituationType, String situationType) {
        this.idCarSituationType = idCarSituationType;
        this.situationType = situationType;
    }

    public int getIdCarSituationType() {
        return idCarSituationType;
    }

    public String getSituationType() {
        return situationType;
    }

    public void setSituationType(String situationType) {
        this.situationType = situationType;
    }
}
