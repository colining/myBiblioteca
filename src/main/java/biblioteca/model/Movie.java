package biblioteca.model;

/**
 * Created by colin on 2018/7/14.
 */
public class Movie {
    private String name;
    private String year;
    private String director;
    private String rating;
    private int number;

    public Movie(String name, String year, String director, String rating, int number) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.number = number;
    }
    public String getDetails() {
        return String.format("%-30s %-30s %-30s %n", name, director, year);
    }

}
