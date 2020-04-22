package java.edu.vsu.yourmovies.dto;

public class MovieDbGenre {
    private int id;
    private String name;

    public MovieDbGenre() {
    }

    public MovieDbGenre(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}