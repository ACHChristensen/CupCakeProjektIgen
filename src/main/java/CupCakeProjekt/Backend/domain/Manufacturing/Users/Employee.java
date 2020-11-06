package CupCakeProjekt.Backend.domain.Manufacturing.Users;

import java.util.HashSet;

public class Employee extends User{

    private HashSet<Customer> customersForTheShop;

    protected Employee(String name, Boolean kundeLogin, String password, String email) {
        super(name, false, password, email);
        customersForTheShop = new HashSet<>();
    }
}
