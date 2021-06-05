package pl.pjatk.RentalService.model;

public class Movie {

    private Long id;
    private String name;
    private Category category;
    private byte isAvailable;

    public byte getAvailable() {
        return isAvailable;
    }

    public void setAvailable(byte available) {
        isAvailable = available;
    }

    public Movie(Long id, String name, Category category, byte isAvailable) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    public Movie(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public Movie(Long id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
