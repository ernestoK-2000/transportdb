package cu.edu.cujae.transportdb.dto;

public class CountryDto {
    private final int idCountry;
    private String country;

    public CountryDto(int idCountry, String country) {
        this.idCountry = idCountry;
        this.country = country;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
