package biblioteca;

class ChoiceController {
    private BibliotecaApp app;

    ChoiceController(BibliotecaApp app) {
        this.app = app;
    }

    void choose(int choice) {
        if (choice > app.mainMenu.menu.size()) {
            app.printer.print(MainMenu.INVALID_OPTION);
        } else if (choice == 1) {
            app.printer.print(app.bookList);
        } else if (choice == 2) {
            System.exit(0);
        }
    }
}
