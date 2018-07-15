package biblioteca.model;

public class Book {
    private String title;
    private String author;
    private int year;
    private int number;

    public Book(String title, String author, int year, int number) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.number = number;
    }


    public String getDetails() {
        return String.format("%-30s %-30s %-30s %n", title, author, year);
    }
}
