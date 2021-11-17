package cu.edu.cujae.transportdb.dto;

public class Groups {
    private final String idGroups;
    private int amountOfPeople;
    private String idCountry;

    public Groups(String idGroups, int amountOfPeople, String idCountry) {
        this.idGroups = idGroups;
        this.amountOfPeople = amountOfPeople;
        this.idCountry = idCountry;
    }

    public String getIdGroups() {
        return idGroups;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public String getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(String idCountry) {
        this.idCountry = idCountry;
    }
}
