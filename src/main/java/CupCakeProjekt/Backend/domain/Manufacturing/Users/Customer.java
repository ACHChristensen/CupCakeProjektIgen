package CupCakeProjekt.Backend.domain.Manufacturing.Users;

import CupCakeProjekt.Backend.domain.Manufacturing.Orders.OrderLine;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    //TODO
    //private List<List<OrderLine>> orderHistory;

    private final String name;

    //TODO attributer til en forældre klasse med navn User?
    private String password;
    private String email;

    public Customer(String name) {
        this.name = name;
        //TODO skal den arve fra user?
    }
}
