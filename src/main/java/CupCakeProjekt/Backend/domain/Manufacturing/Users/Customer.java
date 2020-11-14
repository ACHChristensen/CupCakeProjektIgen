package CupCakeProjekt.Backend.domain.Manufacturing.Users;

import CupCakeProjekt.Backend.domain.Manufacturing.Orders.Order;

import java.util.List;

public class Customer extends User{
    //TODO
    private List<Order> orderHistory;

    public Customer(String name, String email, String password) {
        super(name, true, password, email);
    }

    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String toString() {
        return "Customer: " +
                "Navn ='" + super.getName() + '\'' +
                ", email ='" + super.getEmail() + '\'';
    }
}
