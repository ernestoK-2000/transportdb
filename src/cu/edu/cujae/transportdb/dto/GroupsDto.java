package cu.edu.cujae.transportdb.dto;

public class GroupsDto {
    private final int idGroups;
    private int amountOfPeople;
    private int idCountry;

    public GroupsDto(int idGroups, int amountOfPeople, int idCountry) {
        this.idGroups = idGroups;
        this.amountOfPeople = amountOfPeople;
        this.idCountry = idCountry;
    }

    public int getIdGroups() {
        return idGroups;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }
}
