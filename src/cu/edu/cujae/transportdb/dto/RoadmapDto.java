package cu.edu.cujae.transportdb.dto;

public class RoadmapDto {
    private final int idRoadmap;
    private float initialKm;
    private float finalKm;
    private int idAssignedCar;
    private int idProgramming;

    public RoadmapDto(int idRoadmap, float initialKm, float finalKm, int idAssignedCar, int idProgramming) {
        this.idRoadmap = idRoadmap;
        this.initialKm = initialKm;
        this.finalKm = finalKm;
        this.idAssignedCar = idAssignedCar;
        this.idProgramming = idProgramming;
    }

    public int getIdRoadmap() {
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

    public int getIdAssignedCar() {
        return idAssignedCar;
    }

    public void setIdAssignedCar(int idAssignedCar) {
        this.idAssignedCar = idAssignedCar;
    }

    public int getIdProgramming() {
        return idProgramming;
    }

    public void setIdProgramming(int idProgramming) {
        this.idProgramming = idProgramming;
    }
}
