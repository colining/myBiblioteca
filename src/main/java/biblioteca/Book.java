package biblioteca;

class Book {
    private String title;
    private String author;
    private int year;
    private int num;

    public Book(String title, String author, int year, int num) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.num = num;
    }


    String getDetails() {
        return String.format("%-30s %-30s %-30s %n", title, author, year);
    }
}
