package cu.edu.cujae.transportdb.dto;

public class CarBrandDto {
    private final int idBrand;
    private String brand;

    public CarBrandDto(int idBrand, String brand) {
        this.idBrand = idBrand;
        this.brand = brand;
    }

    public int getIdBrand() {
        return idBrand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
