package CupCakeProjekt.web.widget;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class Navbar {

    private final HttpServletRequest req;

    public Navbar(HttpServletRequest req) {
        this.req = req;
    }

    private static final Map<String, String> SITES = Map.of(
            "Index", "/",
            "Login", "/login",
            "About", "/About"
    );

    public String findUrl(String name) {
        System.out.println("HER ER VI :"+ SITES.get(name) + " " + name);
        return req.getContextPath() + SITES.get(name);
    }
}
