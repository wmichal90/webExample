package pl.coderslab.web.sessions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet("/session1Del")
public class Session1Del extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false );
        if (session != null){
            session.invalidate();
            Cookie cookie = new Cookie("JSESSIONID", "");
            cookie.setMaxAge(0);
            resp.addCookie(cookie);
        }
    }
}
