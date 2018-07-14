package biblioteca;

/**
 * Created by colin on 2018/7/14.
 */
public class User {
    private String name;
    private String emailAddress;
    private String phoneNumber;
    private String libraryNumber;
    private String password;

    public User(String name, String emailAddress, String phoneNumber, String libraryNumber, String password) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.libraryNumber = libraryNumber;
        this.password = password;
    }


    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", libraryNumber='" + libraryNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
