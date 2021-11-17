package cu.edu.cujae.transportdb.dto;

public class CategoryDto {
    private final String idCategory;
    private String category;

    public CategoryDto(String idCategory, String category) {
        this.idCategory = idCategory;
        this.category = category;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
