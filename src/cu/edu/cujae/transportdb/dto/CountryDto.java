package cu.edu.cujae.transportdb.dto;

public class CountryDto {
    private final String idCountry;
    private String country;

    public CountryDto(String idCountry, String country) {
        this.idCountry = idCountry;
        this.country = country;
    }

    public String getIdCountry() {
        return idCountry;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
