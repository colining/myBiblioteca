package biblioteca;

import biblioteca.List.ModelList;
import biblioteca.List.UserList;

import java.util.Scanner;

import static biblioteca.util.*;

/**
 * Created by colin on 2018/7/13.
 */
public class Main {
    public static void main(String[] args) {
        Welcome welcome = new Welcome();
        Scanner scanner = new Scanner(System.in);
        welcome.welcome();
        MyMainMenu myMainMenu = new MyMainMenu();
        myMainMenu.showMenu();
        UserList userList = new UserList();
        userList.init();
        ModelList modelList = new ModelList();
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num != QUIT_NUMBER) {
                if (num == LISTBOOKS) {
                    System.out.println(modelList.getBookList());
                }
                else if (num == CHECKOUTBOOKS) {
                    if (userList.getCurrentUser()!=null||userList.check()) {
                        System.out.println("please input you want checkout book\n");
                        modelList.checkout(scanner.nextInt(),BOOK);
                    }else {
                        System.out.println("please input correct library number and password");
                    }
                }
                else if (num == RETURNBOOKS) {
                    if (userList.getCurrentUser()!=null||userList.check()) {
                        System.out.println("please input book's num you want return \n");
                        modelList.returnCollection(scanner.nextInt(),BOOK);
                    }else {
                        System.out.println("please input correct library number and password");
                    }
                } else if (num == USERINFO) {
                    if (userList.getCurrentUser()!=null||userList.check()) {
                        System.out.println(userList.getCurrentUser().toString());
                    }else {
                        System.out.println("please input correct library number and password");
                    }
                }else if (num == LISTMOVIES) {
                    System.out.println(modelList.getMovieList());
                } else if (num == CHECKOUTMOVIES) {
                    if (userList.getCurrentUser()!=null||userList.check()) {
                        System.out.println("please input you want checkout movie\n");
                        modelList.checkout(scanner.nextInt(),MOVIE);
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
