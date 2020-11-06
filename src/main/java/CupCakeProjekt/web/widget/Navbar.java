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
            "login", "/Login",
            "About", "/aboutpage"
    );

    public String findUrl(String name) {
        return req.getContextPath() + SITES.get(name);
    }
}
