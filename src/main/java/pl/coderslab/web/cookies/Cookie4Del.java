package pl.coderslab.web.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/removeCookie")
public class Cookie4Del extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cookieName = req.getParameter("cookieName");
        try {
            Cookie[] cookies = req.getCookies();
            for (Cookie c: cookies){
                if (c.getName().equals(cookieName)){
                    c.setMaxAge(0);
                    resp.addCookie(c);
                }
            }
        } catch (NullPointerException exc){
            resp.getWriter().write("No cookies available!");
        }
        resp.getWriter().println("<a href=\"index.html\">Home</a>");

    }
}
