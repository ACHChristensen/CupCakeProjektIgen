package CupCakeProjekt.Backend.domain.Repositories;

import CupCakeProjekt.Backend.domain.Manufacturing.Users.Customer;
import CupCakeProjekt.Backend.domain.Manufacturing.Users.User;

public interface UserRepository /*extends UserFactory*/ {

    static User createUser(String name, String email, String password) {
        return null;
    }

    static Customer registerCustomer(User user){
        return null;
    }

    static User find(User user) {
        return null;
    }
}
