package cu.edu.cujae.transportdb.dto;

public class CategoryDto {
    private final int idCategory;
    private String category;

    public CategoryDto(int idCategory, String category) {
        this.idCategory = idCategory;
        this.category = category;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
