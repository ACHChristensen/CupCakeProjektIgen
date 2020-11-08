package CupCakeProjekt.web.pages;


import CupCakeProjekt.Backend.domain.Manufacturing.Users.User;

import CupCakeProjekt.Backend.domain.Manufacturing.Users.UserNotFoundException;
import CupCakeProjekt.web.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet({"/login", "/login/*"})
public class Login extends BaseServlet {


    String email;
    String password;
    public static User tmpUser;

    {
        tmpUser = api.createUser(null, null, null);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        render("Cupcake Olsker - Login", "/WEB-INF/login.jsp", req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse resp) throws IOException {
        String email = (String) rq.getAttribute("email");
        String password = (String) rq.getAttribute("password");
        System.out.println("Her er dine data: ::::::: " + email);

        if (email == null || email.equals("")) {
            resp.sendError(400, "Expected an email");
        } else if (password == null || password.equals("")) {
            resp.sendError(400, "Expected a password");
            tmpUser.setEmail(email);
            tmpUser.setPassword(password);
            try {
                if (!(api.findUser(tmpUser).equals(tmpUser))){
                    System.out.println("Her er dine data: ::::::: Bruger ikke registreret");
                    rq.setAttribute("content", "/WEB-INF/register.jsp");}
                else {
                    HttpSession session = rq.getSession();
                    session.setAttribute("name", tmpUser.getName());
                    System.out.println("Her er dine data: ::::::: " + "Bruger lgogge");
                    rq.setAttribute("content", "/WEB-INF/index.jsp");
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
            } catch (UserNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}