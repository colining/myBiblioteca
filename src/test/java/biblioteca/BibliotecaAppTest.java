package biblioteca;

import org.junit.Before;

public class BibliotecaAppTest {
    private String expectedWelcomeMessage;
    private BibliotecaApp app;

    @Before
    public void setUp() {
        expectedWelcomeMessage = "Welcome to Biblioteca";
        app = new BibliotecaApp();
    }

}