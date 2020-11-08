package CupCakeProjekt.web.pages;

import CupCakeProjekt.Backend.infrastructure.Database;
import CupCakeProjekt.web.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/About")
public class About extends BaseServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {

        render("Olsker Cupcakes","/WEB-INF/about.jsp", req,resp);

    }
}
