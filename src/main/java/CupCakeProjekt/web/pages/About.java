package CupCakeProjekt.web.pages;

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

        req.getSession().setAttribute("name", "Gæst");
        req.getSession().setAttribute("quanitity", ""+0);
        req.getSession().setAttribute("version", ""+ api.getVersion());
        render("Olsker Cupcakes","/WEB-INF/index.jsp", req,resp);

    }
}
