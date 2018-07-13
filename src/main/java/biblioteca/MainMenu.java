package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMenu {
    List<String> menu;
    private ChoiceController choiceController;
    final static String INVALID_OPTION;

    static {
        INVALID_OPTION = "Select a valid option!";
    }

    MainMenu(ChoiceController choiceController) {
        menu = new ArrayList<>();
        menu.add("1. List Books");
        menu.add("2. Quit");
        this.choiceController = choiceController;
    }

    @Override
    public String toString() {
        return menu.stream().collect(Collectors.joining("\n"))+"\n";
    }

    void choose(int number) {
        choiceController.choose(number);
    }


}
