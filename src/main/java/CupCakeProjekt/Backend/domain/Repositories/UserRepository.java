package CupCakeProjekt.Backend.domain.Repositories;

import CupCakeProjekt.Backend.domain.Manufacturing.Users.Customer;
import CupCakeProjekt.Backend.domain.Manufacturing.Users.User;

public interface UserRepository /*extends UserFactory*/ {

    static Customer createNewCustomer(String name, String email, String password) {
        return new Customer(name, email,password);
    }

    static Customer registerCustomer(User user){
        return null;
    }

    static User find(User user) {
        return null;
    }
}
