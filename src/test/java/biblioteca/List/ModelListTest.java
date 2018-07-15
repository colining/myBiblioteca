package biblioteca.List;


import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static biblioteca.util.BOOK;
import static biblioteca.util.MOVIE;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by colin on 2018/7/15.
 */
public class ModelListTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private ModelList modelList = null;
    private String exceptBookList = null;
    private String exceptMovieList = null;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        modelList = new ModelList();
        modelList.init();
        exceptBookList = String.format("%-30s %-30s %-30s %n", "Test-driven Development: By Example", "Kent Beck", 2003) +
                String.format("%-30s %-30s %-30s %n", "A Song of Ice and Fire", "George Raymond Richard Martin", 1996);
        exceptMovieList = String.format("%-30s %-30s %-30s %n", "Titanic", "James Cameron", 1997) +
                String.format("%-30s %-30s %-30s %n", "Avatar", "James Cameron", 2009);
    }

    @Test
    public void checkout_book() {
        modelList.checkout(1, BOOK);
        exceptBookList = String.format("%-30s %-30s %-30s %n", "A Song of Ice and Fire", "George Raymond Richard Martin", 1996);
        assertEquals(exceptBookList, modelList.getBookList());
    }

    @Test
    public void checkout_movie() {
        modelList.checkout(1, MOVIE);
        exceptMovieList = String.format("%-30s %-30s %-30s %n", "Avatar", "James Cameron", 2009);
        assertEquals(exceptMovieList, modelList.getMovieList());
    }


    private String systemOut() {
        return outContent.toString();
    }

    @Test
    public void returnCollection() {
        modelList.checkout(1, MOVIE);
        assertThat(outContent.toString(), endsWith("enjoy your movie, have fun\n"));
        modelList.returnCollection(3, BOOK);
        assertThat(outContent.toString(), is("enjoy your movie, have fun\n" + "this book is not our,please return to other biblioteca\r\n"));
        modelList.returnCollection(1, MOVIE);
        assertEquals(exceptMovieList,modelList.getMovieList());
    }

    @Test
    public void getBookList() {
        assertEquals(exceptBookList, modelList.getBookList());
    }

    @Test
    public void getMovieList() {
        assertEquals(exceptMovieList, modelList.getMovieList());

    }


}