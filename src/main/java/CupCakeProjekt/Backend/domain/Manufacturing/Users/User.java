package CupCakeProjekt.Backend.domain.Manufacturing.Users;

public abstract class User{
    private final String name;
    private final Boolean CustommerRole;
    private String password;
    private String email;

    protected User(String name, Boolean kundeLogin, String password, String email) {
        this.name = name;
        this.CustommerRole = kundeLogin;
        this.password = password;
        this.email = email;
    }
}
