package CupCakeProjekt.web.pages;
import CupCakeProjekt.Backend.infrastructure.Database;
import CupCakeProjekt.web.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("")
public class Index extends BaseServlet {
        Object name;
        Object quanitity;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {


        if ( this.name == null)
            req.getSession().setAttribute("name", "Gæst");
        else {
            req.getSession().setAttribute("name", Login.tmpUser.getName());
        }

        req.getSession().setAttribute("version", ""+ Database.versionItSHouldBe);

        if (this.quanitity == null) {
            req.getSession().setAttribute("quanitity", 0);}

        render("Olsker Cupcakes","/WEB-INF/index.jsp", req,resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.name = req.getSession().getAttribute("name");
        this.quanitity = req.getSession().getAttribute("quanitity");
        super.doPost(req, resp);
    }
}