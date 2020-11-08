package CupCakeProjekt.web.pages;
import CupCakeProjekt.web.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.parser.Parser;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/ShoppingCart")
public class ShoppingCart extends BaseServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        if (req.getPathInfo() == null) {
            render("Olsker Cupcakes - ShoppingKurv", "/WEB-INF/choosedcart.jsp", req, resp);
        } else {
            int shoppingCartId = Integer.parseInt(req.getPathInfo().substring(1));
            log(req,"Accessing Shopping Cart " + req.getPathInfo() + ": "+ shoppingCartId);
        }
    }

    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse resp) {
        String topFlavor = rq.getParameter("topping");
        String botFlavor = rq.getParameter("bottom");
        int quanitity = Integer.parseInt(rq.getParameter("quanitity"));
        if (!(quanitity > 0))
            throw new IllegalArgumentException("Dette er ikke et gyldigt tal, prøv igen");
        try {
            super.doPost(rq, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
