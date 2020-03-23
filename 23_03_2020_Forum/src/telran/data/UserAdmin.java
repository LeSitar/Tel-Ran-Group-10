package telran.data;

public class UserAdmin extends User{

    private String password;

    public UserAdmin(String userName, int age, String password) {
        super(userName, age);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
