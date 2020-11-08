package CupCakeProjekt.Backend.domain.Manufacturing.Users;

import CupCakeProjekt.Backend.domain.Manufacturing.Orders.Order;

import java.util.List;

public class Customer extends User{
    //TODO
    private List<Order> orderHistory;

    private String name;
    private String password;
    private String email;

    public Customer(String name, String email, String password) {
        super(name, true, password, email);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
