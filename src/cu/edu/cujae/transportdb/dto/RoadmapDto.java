package cu.edu.cujae.transportdb.dto;

public class RoadmapDto {
    private final int idRoadmap;
    private int initialKm;
    private int finalKm;
    private int idAssignedCar;
    private int idProgramming;

    public RoadmapDto(int idRoadmap, int initialKm, int finalKm, int idAssignedCar, int idProgramming) {
        this.idRoadmap = idRoadmap;
        this.initialKm = initialKm;
        this.finalKm = finalKm;
        this.idAssignedCar = idAssignedCar;
        this.idProgramming = idProgramming;
    }

    public int getIdRoadmap() {
        return idRoadmap;
    }

    public int getInitialKm() {
        return initialKm;
    }

    public void setInitialKm(int initialKm) {
        this.initialKm = initialKm;
    }

    public int getFinalKm() {
        return finalKm;
    }

    public void setFinalKm(int finalKm) {
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
