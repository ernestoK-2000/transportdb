package cu.edu.cujae.transportdb.dto;

public class CarDto extends Dto{
    private final int idCar;
    private String carNumber;
    private String carBrand;
    private int carSeats;
    private int kmAvailable;

    public CarDto(int idCar, String carNumber, String carBrand, int carSeats, int kmAvailable) {
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

    public int getKmAvailable() {
        return kmAvailable;
    }

    public void setKmAvailable(int kmAvailable) {
        this.kmAvailable = kmAvailable;
    }
}
