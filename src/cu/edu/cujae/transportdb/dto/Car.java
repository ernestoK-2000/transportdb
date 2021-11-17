package cu.edu.cujae.transportdb.dto;

public class Car {
    private final String idCar;
    private String carNumber;
    private String carBrand;
    private int carSeats;
    private float kmAvailable;

    public Car(String idCar, String carNumber, String carBrand, int carSeats, int kmAvailable) {
        this.idCar = idCar;
        this.carNumber = carNumber;
        this.carBrand = carBrand;
        this.carSeats = carSeats;
        this.kmAvailable = kmAvailable;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getIdCar() {
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
