package cu.edu.cujae.transportdb.dto;

public class CarBrandDto {
    private final String idBrand;
    private String brand;

    public CarBrandDto(String idBrand, String brand) {
        this.idBrand = idBrand;
        this.brand = brand;
    }

    public String getIdBrand() {
        return idBrand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
