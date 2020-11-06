package CupCakeProjekt.Backend.domain.Manufacturing.Users;

import CupCakeProjekt.Backend.domain.Manufacturing.Orders.Order;

import java.util.List;

public class Customer extends User{
    //TODO
    private List<Order> orderHistory;

    private String name;
    private String password;
    private String email;

    protected Customer(String name, String email, String password) {
        super(name, true, password, email);
    }
}
