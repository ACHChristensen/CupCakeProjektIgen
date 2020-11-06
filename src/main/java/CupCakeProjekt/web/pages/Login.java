package CupCakeProjekt.web.pages;

import CupCakeProjekt.Backend.domain.Manufacturing.Users.User;
import CupCakeProjekt.web.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends BaseServlet {

    private User user;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        if (req.getPathInfo() == null) {
            render("Olsker Cupcakes - login", "/WEB-INF/login.jsp", req, resp);
        } else {
            int shoppingCartId = Integer.parseInt(req.getPathInfo().substring(1));
            log(req,"Accessing Shopping Cart " + req.getPathInfo() + ": "+ shoppingCartId);
        }
    }

    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse resp) {
        try {
            String email = rq.getParameter("email");
            String password = rq.getParameter("password");
            if (email == null || email.equals("")) {
                resp.sendError(400, "Expected an email");
            }
            if (password == null || password.equals("")) {
                resp.sendError(400, "Expected a password");
            }
            super.doPost(rq, resp);

        } catch (
                ServletException e) {
            System.out.println("Noget gik galt med Servlet");
            e.printStackTrace();
        } catch (
                IOException e) {
            System.out.println();
            e.printStackTrace();
        }
    }
}