package CupCakeProjekt.web.pages;

import CupCakeProjekt.web.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/login", "/login/*"})
public class Login extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        req.removeAttribute("email1");
        req.removeAttribute("password1");
        req.setAttribute("name",null);
        render("Cupcake Olsker - Login", "/WEB-INF/login.jsp", req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse resp) throws IOException {
        try {
            String email = (String) rq.getParameter("email1");
            String password = (String) rq.getParameter("password1");

            System.out.println("Her er dine data: ::::::: " + email);
            System.out.println("Her er dine data: ::::::: " + password);

            if (email == null || email.equals("")) {
                resp.sendError(400, "Expected an email");
            } else if (password == null || password.equals("")) {
                resp.sendError(400, "Expected a password");
            }
            Boolean sameEmail = db.compareUsers(email);
            if (sameEmail){
                System.out.println(email + " Success!");
                rq.getSession().setAttribute("loggedin", "true");
                String name = db.getNameFromDB(email);
                rq.getSession().setAttribute("name", name);
                System.out.println("Her er dine data: ::::::: logged in true");
                resp.sendRedirect(rq.getContextPath() + "/");
            } else {
                System.out.println("Her er dine data: ::::::: loggedin" + rq.getSession().getAttribute("loggedin"));
                //String pathRegister = rq.getContextPath()+Navbar.getSITES().get("Register");
                //rq.getSession().setAttribute("loginPathRegister", pathRegister);
                resp.sendRedirect(rq.getContextPath() + "/register");
            }
            rq.getSession().setAttribute("email2", email);
            rq.getSession().setAttribute("password2", password);
            System.out.println("slut login.java");
            //super.doPost(rq, resp);
        } catch (
                IOException e) {
            System.out.println();
            e.printStackTrace();
        }
    }
}
