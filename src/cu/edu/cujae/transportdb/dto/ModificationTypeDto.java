package cu.edu.cujae.transportdb.dto;

public class ModificationTypeDto {
    private final String idModificationType;
    private String modification;

    public ModificationTypeDto(String idModificationType, String modification) {
        this.idModificationType = idModificationType;
        this.modification = modification;
    }

    public String getIdModificationType() {
        return idModificationType;
    }

    public String getModification() {
        return modification;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }
}
