package biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.fest.assertions.api.Assertions.assertThat;


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
        assertThat(systemOut().endsWith("Welcome to Biblioteca"));
    }
    private String systemOut() {
        return outContent.toString();
    }
}
