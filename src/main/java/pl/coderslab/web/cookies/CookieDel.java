package pl.coderslab.web.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteCookie")
public class CookieDel extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            Cookie[] cookies = req.getCookies();
            int counter = 0;
            for (Cookie c: cookies){
                if (c.getName().equals("User")){
                    c.setMaxAge(0);
                    resp.addCookie(c);
                    counter++;
                }
            }
            if (counter == 0){
                resp.getWriter().write("BRAK");
            }
//            resp.sendRedirect("/");
        } catch (NullPointerException exc){
            resp.getWriter().write("No cookies available!");
        }


    }
}
