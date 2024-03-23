package pl.coderslab.web.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;


@WebServlet("/showAllCookies")
public class Cookie4Show extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Cookie[] allCookies = req.getCookies();
            if (allCookies!=null){
                for (Cookie c: allCookies){
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.format("<p>%s:  <a href=\"/removeCookie?cookieName=%s\">Usun %s</a></p>" , c.getName() ,c.getName(), c.getName()));
                    resp.getWriter().println(sb.toString());
                }
            }
            resp.getWriter().println("<a href=\"index.html\">Home</a>");
        } catch (NullPointerException exc){
            resp.getWriter().write("No cookies available!");
        }
    }
}
