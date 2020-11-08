package CupCakeProjekt.Backend.entries;

import CupCakeProjekt.Backend.api.CupCakeAppRepository;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Bottom;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.CupCake;
import CupCakeProjekt.Backend.domain.Manufacturing.Cupcakes.Topping;
import CupCakeProjekt.Backend.domain.Manufacturing.Orders.OrderLine;
import CupCakeProjekt.Backend.infrastructure.Database;
import CupCakeProjekt.web.BaseServlet;

import javax.persistence.criteria.Order;
import javax.servlet.Servlet;
import java.util.ArrayList;
import java.util.List;

public class CupCakeApp {

    public static void main(String[] args) {

        /*//Test
        Database db = new Database();
        CupCakeAppRepository cupCakeApp = new CupCakeAppRepository(db,db,db);

        String flavor = "Chocolate";
        Topping top = cupCakeApp.createTop(flavor);
        Bottom bot = cupCakeApp.createBottom(flavor);
        CupCake cupCake = cupCakeApp.createCupcake(top, bot);

        String flavor2 = "Almond";
        Topping top2 = cupCakeApp.createTop(flavor);
        Bottom bot2 = cupCakeApp.createBottom(flavor2);
        CupCake cupCake1 = cupCakeApp.createCupcake(top2, bot2);

        //TODO List<OrderLine> order = cupCakeApp.createOrder();
        //order.add(new OrderLine(cupCake,4));
        //order.add(new OrderLine(cupCake1, 9));*/

    }
}
