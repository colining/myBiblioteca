package biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private String title;
    private String author;
    private int year;
    private int num;
    private Book book;
    private String bookDetails;

    @Before
    public void setUp() {
        title = "A Game of Thrones";
        author = "George R.R. Martin ";
        year = 2012;
        num = 1;
        book = new Book(title, author, year, num);
        bookDetails = String.format("%-30s %-30s %-30s %n", title, author, year);
    }

    @Test
    public void shouldGetBookDetails() {
        assertEquals(bookDetails, book.getDetails());
    }

}