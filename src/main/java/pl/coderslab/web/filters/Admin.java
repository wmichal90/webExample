package pl.coderslab.web.filters;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/admin")
public class Admin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{

            HttpSession session = req.getSession(false);
            String username = (String) session.getAttribute("username");
            getServletContext().getRequestDispatcher("/admin.jsp").forward(req,resp);
        } catch (NullPointerException exc){
            resp.sendRedirect("/login");
        }


    }
}
