package biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;



/**
 * Created by colin on 2018/7/15.
 */
public class MyMainMenuTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private MyMainMenu myMainMenu;

    @Before
    public void setup() {
        myMainMenu = new MyMainMenu();

        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void showMenu() {
        MyMainMenu myMainMenu = new MyMainMenu();
        myMainMenu.showMenu();
        assertThat(outContent.toString(),is("------------------------------\r\n" +
                "1. List Books\n" +
                "2. checkout Books\n" +
                "3. return Books\n" +
                "4. List Movies\n" +
                "5. checkout movies\n" +
                "6. return movies\n" +
                "7. user info\n" +
                "8. Quit\r\n" +
                "------------------------------\r\n" ));
    }
    private String systemOut() {
        return outContent.toString();
    }
}