package biblioteca;



import java.io.PrintStream;
import java.util.Scanner;

public class BibliotecaApp {
    PrintStream printer;
    private Scanner input;
    private Welcome welcome;
    BookList bookList;
    MainMenu mainMenu;
    private ChoiceController choiceController;

    public BibliotecaApp(PrintStream printStream, Scanner input, Welcome welcome, BookList bookList, MainMenu mainMenu, ChoiceController choiceController) {
        this.printer = printStream;
        this.input = input;
        this.welcome = welcome;
        this.bookList = bookList;
        this.mainMenu = mainMenu;
        this.choiceController = choiceController;
    }

    BibliotecaApp() {
        this.printer = System.out;
        this.input = new Scanner(System.in);
        this.welcome = new Welcome();
        this.bookList = new BookList();
        this.bookList.init();
        this.choiceController = new ChoiceController(this);
        this.mainMenu = new MainMenu(choiceController);
    }

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.welcome.welcome();
        app.printer.print(app.mainMenu);
        int num = app.input.nextInt();
        app.mainMenu.choose(num);
    }

}
