package cu.edu.cujae.transportdb.dto;

public class Country {
    private final String idCountry;
    private String country;

    public Country(String idCountry, String country) {
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
