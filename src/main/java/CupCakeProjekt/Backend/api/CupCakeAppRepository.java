package CupCakeProjekt.Backend.api;

import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Bottom;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCake;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Topping;
import CupCakeProjekt.Backend.domain.Manufacturing.Orders.OrderFactory;
import CupCakeProjekt.Backend.domain.Manufacturing.Orders.OrderLine;
import CupCakeProjekt.Backend.domain.Manufacturing.Users.Customer;
import CupCakeProjekt.Backend.domain.Manufacturing.Users.User;
import CupCakeProjekt.Backend.domain.Manufacturing.Users.UserNotFoundException;
import CupCakeProjekt.Backend.domain.Repositories.CupCakeRepository;
import CupCakeProjekt.Backend.domain.Repositories.OrderRepository;
import CupCakeProjekt.Backend.domain.Repositories.UserRepository;


import java.util.ArrayList;
import java.util.List;

public class CupCakeAppRepository  {

    private final CupCakeRepository cupCakeRepository;
    private final OrderRepository orderRepository;
    private final List<OrderLine> order = new ArrayList<>();
    private final OrderLine orderLine = null;
    private static final int version = 2;
    private final UserRepository userRepository;


    public CupCakeAppRepository(CupCakeRepository cupCakeRepository, OrderRepository orderRepository, UserRepository userRepository) {
        this.cupCakeRepository = cupCakeRepository;
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
    }

    public Topping createTop(String flavor){
        Topping top = cupCakeRepository.createTop(flavor);
        return top;
    }

    public Bottom createBottom(String flavor) {
        Bottom bottom = cupCakeRepository.createBottom(flavor);
        return bottom;
    }

    public CupCake createCupcake(Topping top, Bottom bot) {
        CupCake cupCake = cupCakeRepository.createCupCake(top, bot);
        return cupCake;
    }


    public void addToOrder(CupCake cupCake, int quanitity){
        OrderLine orderLine = OrderFactory.addAsOrderLine(cupCake,quanitity);
        order.add(orderLine);
    }

    //TODO public List<OrderLine> createOrder(List<OrderLine> orderlines) {
    //}

    public User createUser(String name, String email, String password){
        User user = UserRepository.createUser(name, email, password);
        return user;
    }

     public User findUser(User user) throws UserNotFoundException {
        User usertmp = UserRepository.find(user);
         if (usertmp == null || user.equals("")) {
             throw new UserNotFoundException(user);
         }
        return usertmp;
    }

    public Customer registerCustomer(User user, String actualName){
        Customer customer = (Customer) user;
        customer.setName(actualName);
        return customer;
    }

}
