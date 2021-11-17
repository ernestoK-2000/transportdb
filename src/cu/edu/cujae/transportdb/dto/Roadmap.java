package cu.edu.cujae.transportdb.dto;

public class Roadmap {
    private final String idRoadmap;
    private float initialKm;
    private float finalKm;
    private String idAssignedCar;
    private String idProgramming;

    public Roadmap(String idRoadmap, float initialKm, float finalKm, String idAssignedCar, String idProgramming) {
        this.idRoadmap = idRoadmap;
        this.initialKm = initialKm;
        this.finalKm = finalKm;
        this.idAssignedCar = idAssignedCar;
        this.idProgramming = idProgramming;
    }

    public String getIdRoadmap() {
        return idRoadmap;
    }

    public float getInitialKm() {
        return initialKm;
    }

    public void setInitialKm(float initialKm) {
        this.initialKm = initialKm;
    }

    public float getFinalKm() {
        return finalKm;
    }

    public void setFinalKm(float finalKm) {
        this.finalKm = finalKm;
    }

    public String getIdAssignedCar() {
        return idAssignedCar;
    }

    public void setIdAssignedCar(String idAssignedCar) {
        this.idAssignedCar = idAssignedCar;
    }

    public String getIdProgramming() {
        return idProgramming;
    }

    public void setIdProgramming(String idProgramming) {
        this.idProgramming = idProgramming;
    }
}
