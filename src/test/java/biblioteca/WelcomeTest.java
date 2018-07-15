package biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;


public class WelcomeTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void testWelcomeMessage() {

        Welcome welcome = new Welcome();
        welcome.welcome();
        assertThat(outContent.toString(),endsWith("Welcome to Biblioteca\n"));
    }
    private String systemOut() {
        return outContent.toString();
    }
}
