package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;

import static biblioteca.util.*;

/**
 * Created by colin on 2018/7/13.
 */
public class Main {
    public static void main(String[] args) {
        Welcome welcome = new Welcome();
        BookList bookList = new BookList();
        Scanner scanner = new Scanner(System.in);
        welcome.welcome();
        MyMainMenu myMainMenu = new MyMainMenu();
        myMainMenu.showMenu();
        while (scanner.hasNext()) {
            int num = scanner.nextInt();

            if (num != QUIT_NUMBER) {
                if (num == 1) {
                    System.out.println(bookList.toString());
                }
                else if (num == 2) {
                    System.out.println("please input you want checkout book\n");
                    bookList.checkout(scanner.nextInt());
                }
                else if (num == 3) {
                    System.out.println("please input book's num you want return \n");
                    bookList.returnBook(scanner.nextInt());
                }
                myMainMenu.showMenu();
                continue;
            }
            System.exit(0);

        }
    }


}
