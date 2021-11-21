package cu.edu.cujae.transportdb.dto;

public class CarDto extends Dto{
    private final int idCar;
    private String carNumber;
    private String carBrand;
    private int carSeats;
    private float kmAvailable;

    public CarDto(int idCar, String carNumber, String carBrand, int carSeats, float kmAvailable) {
        this.idCar = idCar;
        this.carNumber = carNumber;
        this.carBrand = carBrand;
        this.carSeats = carSeats;
        this.kmAvailable = kmAvailable;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getCarSeats() {
        return carSeats;
    }

    public void setCarSeats(int carSeats) {
        this.carSeats = carSeats;
    }

    public float getKmAvailable() {
        return kmAvailable;
    }

    public void setKmAvailable(float kmAvailable) {
        this.kmAvailable = kmAvailable;
    }
}
