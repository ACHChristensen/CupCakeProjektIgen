package CupCakeProjekt.web.pages;
import CupCakeProjekt.Backend.domain.Manufacturing.Orders.OrderLine;
import CupCakeProjekt.web.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.parser.Parser;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

@WebServlet("/ShoppingCart")
public class ShoppingCart extends BaseServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        if (!(((String)req.getSession().getAttribute("order")) == null)){
        ArrayList<OrderLine> order= (ArrayList<OrderLine>) req.getSession().getAttribute("order");
        //if (!(order.isEmpty()))
        req.getSession().setAttribute("orderinchart", api.createOrder(order));}
        //int quanitity = Integer.parseInt((String) req.getServletContext().getAttribute("quanitity"));
        //if (req.getPathInfo() == null) {
            render("Olsker Cupcakes - ShoppingKurv", "/WEB-INF/choosedcart.jsp", req, resp);
        //} else {
        //    int shoppingCartId = Integer.parseInt(req.getPathInfo().substring(1));
        //    log(req,"Accessing Shopping Cart " + req.getPathInfo() + ": "+ shoppingCartId);
        //}
    }

    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse resp) throws IOException {
        rq.getSession().setAttribute("orderinchart", null);
        if (((String) rq.getSession().getAttribute("loggedin")) == null) {
            resp.sendRedirect(rq.getContextPath() + "/login");
        } else {
            rq.getSession().setAttribute("quanitity", null);
            resp.sendRedirect(rq.getContextPath() + "/orderconfirmation");
        }
    }
}
