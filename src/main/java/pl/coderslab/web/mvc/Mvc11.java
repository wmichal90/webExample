package pl.coderslab.web.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

@WebServlet("/mvc11")
public class Mvc11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String role = req.getParameter("role");
        if (role != null){

            String userRole = String.format("ROLE_%s", role.toUpperCase());
            req.setAttribute("userRole", userRole);
        } else {
            req.setAttribute("userRole", "guest");
        }
        getServletContext().getRequestDispatcher("/jsp1.jsp").forward(req,resp);


    }
}

// od wykladowcy
//package pl.coderslab.web.mvc;
//
//        import javax.servlet.ServletException;
//        import javax.servlet.annotation.WebServlet;
//        import javax.servlet.http.HttpServlet;
//        import javax.servlet.http.HttpServletRequest;
//        import javax.servlet.http.HttpServletResponse;
//        import java.io.IOException;
//
//@WebServlet("/mvc11")
//public class Mvc11 extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//        String role = req.getParameter("role");
//        if (role == null) {
//            req.setAttribute("userRole", "guest");
//        } else {
//            String userRole = "ROLE_" + role.toUpperCase();
//            req.setAttribute("userRole", userRole);
//        }
//        getServletContext().getRequestDispatcher("/jsp1.jsp")
//                .forward(req, resp);
//    }
//}
