package pl.coderslab.web.filters;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    private final static String USER = "admin";
    private final static String PASSWORD = "coderslab";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("username");
        String pass = req.getParameter("password");
        if (user.equals(USER) && pass.equals(PASSWORD)) {
            // dodaj dane do sesji pod kluczem: username
            HttpSession session = req.getSession();
            session.setAttribute("username", user);
            session.setAttribute("password", pass);
            // przekieruj na adres /admin
            resp.sendRedirect("/admin");
        } else {
            resp.getWriter().write("Niepoprawne dane logowania!");
            System.out.println("WRONG LOGING DATA");
            this.doGet(req, resp);
            // wyświetl informacje o błędnych danych
        }

    }
}
