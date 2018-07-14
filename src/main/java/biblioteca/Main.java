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
        UserList userList = new UserList();
        userList.init();
        while (scanner.hasNext()) {
            int num = scanner.nextInt();

            if (num != QUIT_NUMBER) {
                if (num == LISTBOOKS) {
                    System.out.println(bookList.toString());
                }
                else if (num == CHECKOUTBOOKS) {
                    if (userList.getCurrentUser()!=null||userList.check()) {
                        System.out.println("please input you want checkout book\n");
                        bookList.checkout(scanner.nextInt());
                    }else {
                        System.out.println("please input correct library number and password");
                    }
                }
                else if (num == RETURNBOOKS) {
                    if (userList.getCurrentUser()!=null||userList.check()) {
                        System.out.println("please input book's num you want return \n");
                        bookList.returnBook(scanner.nextInt());
                    }else {
                        System.out.println("please input correct library number and password");
                    }
                } else if (num == USERINFO) {
                    if (userList.getCurrentUser()!=null||userList.check()) {
                        System.out.println(userList.getCurrentUser().toString());
                    }else {
                        System.out.println("please input correct library number and password");
                    }
                }
                myMainMenu.showMenu();
                continue;
            }
            System.exit(0);

        }
    }


}
