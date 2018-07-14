package biblioteca;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by colin on 2018/7/14.
 */
public class UserList {
    private HashMap<String, User> userList = new HashMap<>();

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    private User currentUser = null;
    void init(){
        userList.put("123-456", new User("colin", "123@qq.com", "123456", "123-456", "123"));
        userList.put("234-567", new User("Lili", "234@qq.com", "234567", "234-567", "456"));
    }

    void add(User user) {
        userList.put(user.getLibraryNumber(), user);
    }
    boolean check(){
            System.out.println("please input your library number");
            Scanner scanner = new Scanner(System.in);
            String libnum = scanner.nextLine();
            if (userList.containsKey(libnum)) {
                return this.checkPassWord(libnum);
            }
        return false;
    }

    boolean checkPassWord(String libnum) {
        System.out.println("please input your password");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (userList.get(libnum).getPassword().equals(password)) {
            this.setCurrentUser(userList.get(libnum));
            return true;
        }
        else return false;
    }
}
