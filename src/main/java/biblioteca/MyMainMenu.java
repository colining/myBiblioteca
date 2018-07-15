package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by colin on 2018/7/13.
 */
public class MyMainMenu {
    private List<String> menu;

    MyMainMenu() {
        menu = new ArrayList<>();
        menu.add("1. List Books");
        menu.add("2. checkout Books");
        menu.add("3. return Books");
        menu.add("4. List Movies");
        menu.add("5. checkout movies");
        menu.add("6. return movies");
        menu.add("7. user info");
        menu.add("8. Quit");
    }

    @Override
    public String toString() {
        return menu.stream().collect(Collectors.joining("\n"));
    }

    public void showMenu() {
        System.out.println("------------------------------");
        System.out.println(this.toString());
        System.out.println("------------------------------");
    }
}
