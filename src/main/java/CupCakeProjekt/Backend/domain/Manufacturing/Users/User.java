package CupCakeProjekt.Backend.domain.Manufacturing.Users;

public class User{
    private String name;
    private final Boolean CustommerRole;
    protected String password;
    private String email;

    public User(String name, Boolean kundeLogin, String password, String email) {
        this.name = name;
        this.CustommerRole = kundeLogin;
        this.password = password;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public Boolean getCustommerRole() {
        return CustommerRole;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
