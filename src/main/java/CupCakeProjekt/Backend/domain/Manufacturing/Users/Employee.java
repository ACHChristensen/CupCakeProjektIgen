package CupCakeProjekt.Backend.domain.Manufacturing.Users;

import java.util.HashSet;

public class Employee extends User{

    private HashSet<Customer> customersForTheShop;

    Employee(String name, String password, String email) {
        super(name, false, password, email);
        customersForTheShop = new HashSet<>();
    }

    @Override
    public String getPassword() {
        return password;
    }
}
