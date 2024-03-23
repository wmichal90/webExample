package pl.coderslab.web.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/setCookie")
public class CookieSet extends HttpServlet {
    private static final int DAY_IN_SECONDS= 86400;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie userCookie = new Cookie("User", "CodersLab");
        userCookie.setMaxAge(DAY_IN_SECONDS);
        resp.addCookie(userCookie);
        resp.sendRedirect("/");
    }
}
