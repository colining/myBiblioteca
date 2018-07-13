package biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainMenuTest {
    private MainMenu mainMenu;
    private String expectedMenu;
    private String expectedInvalidOption;

    @Before
    public void setUp() {
        expectedMenu = "1. List Books\n2. Quit\n";
        expectedInvalidOption = "Select a valid option!";
    }

    @Test
    public void testShowMenu() {
        mainMenu = new MainMenu(new ChoiceController(new BibliotecaApp()));
        assertEquals(expectedMenu, mainMenu.toString());
    }

    @Test
    public void testInvalidOption() {
        BibliotecaApp app = new BibliotecaApp();
        PrintStream printStream = mock(PrintStream.class);
        app.printer = printStream;
        app.mainMenu.choose(100);
        verify(printStream).print(expectedInvalidOption);
    }
}
