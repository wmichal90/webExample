package pl.coderslab.web.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getCookieJsp")
public class jspSetCookie extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Cookie userCookie = new Cookie("foo", "bar");
        userCookie.setMaxAge(100);
        resp.addCookie(userCookie);
    }
}
