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

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {

        req.setAttribute("version", ""+ Database.versionItSHouldBe);

        render("Olsker Cupcakes","/WEB-INF/index.jsp", req,resp);


    }

}