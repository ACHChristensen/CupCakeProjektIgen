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
            "About", "/About",
            "Contact", "/Contact",
            "Cart", "/ShoppingCart",
            "Cupcakes", "/Cupcakes",
            "User", "/User",
            "Register","/register",
            "Logout", "/logout",
            "Reconstruction", "/Reconstruction"
    );

    public String findUrl(String name) {
        return req.getContextPath() + SITES.get(name);
    }

    public static Map<String, String> getSITES() {
        return SITES;
    }
}
