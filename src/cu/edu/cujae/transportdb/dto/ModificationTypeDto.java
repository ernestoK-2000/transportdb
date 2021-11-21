package cu.edu.cujae.transportdb.dto;

public class ModificationTypeDto {
    private final int idModificationType;
    private String modification;

    public ModificationTypeDto(int idModificationType, String modification) {
        this.idModificationType = idModificationType;
        this.modification = modification;
    }

    public int getIdModificationType() {
        return idModificationType;
    }

    public String getModification() {
        return modification;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }
}
