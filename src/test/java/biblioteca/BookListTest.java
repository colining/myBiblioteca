package biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookListTest {
    private BookList bookList;
    private String expectedBookList;


    @Before
    public void setUp()  {
        bookList = new BookList();
        bookList.init();
        expectedBookList = String.format("%-30s %-30s %-30s %n", "Test-driven Development: By Example", "Kent Beck", 2003)+
                String.format("%-30s %-30s %-30s %n", "A Song of Ice and Fire:", "George Raymond Richard Martin", 1996);
    }

    @Test
    public void testShowBooks() {
        assertEquals(expectedBookList,bookList.toString());
    }

    @Test
    public void testCheckOut_should_return_just_book1() {
        bookList.checkout(2);
        expectedBookList = String.format("%-30s %-30s %-30s %n", "Test-driven Development: By Example", "Kent Beck", 2003);
        assertEquals(expectedBookList,bookList.toString());
    }
    @Test
    public void testCheckOut_should_return_just_book2() {
        bookList.checkout(1);
        expectedBookList = String.format("%-30s %-30s %-30s %n", "A Song of Ice and Fire:", "George Raymond Richard Martin", 1996);
        assertEquals(expectedBookList,bookList.toString());
    }

    @Test
    public void testReturnBook_should_return_book1_and_book2() {
        bookList.checkout(1);
        bookList.returnBook(1);
        expectedBookList = String.format("%-30s %-30s %-30s %n", "Test-driven Development: By Example", "Kent Beck", 2003)+
                String.format("%-30s %-30s %-30s %n", "A Song of Ice and Fire:", "George Raymond Richard Martin", 1996);
        assertEquals(expectedBookList,bookList.toString());
    }

}
