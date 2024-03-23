package pl.coderslab.web.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/showCookie")
public class CookieGet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        String cookieValue = null;
        for (Cookie c: cookies){
            if (c.getName().equals("User")){
                cookieValue = c.getValue();
            }
        }
//        assert cookieValue != null;
        resp.getWriter().write(cookieValue);
    }
}
