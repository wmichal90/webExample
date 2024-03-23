package pl.coderslab.web.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc12")
public class Mvc12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String start = req.getParameter("start");
        String end = req.getParameter("end");
        if (start != null && end != null){
            start+=10;
            end+=10;
            req.setAttribute("start", start);
            req.setAttribute("end", end);
        } else {
            req.setAttribute("start", 0);
            req.setAttribute("end", 0);

        }
        getServletContext().getRequestDispatcher("/jsp2.jsp").forward(req,resp);
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
//@WebServlet("/mvc12")
//public class Mvc12 extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int start = 1;
//        int end = 10;
//        try {
//            start = Integer.parseInt(req.getParameter("start"));
//            end = Integer.parseInt(req.getParameter("end"));
//            start += 10;
//            end += 10;
//        } catch (NumberFormatException ex) {
//            System.out.println("Exception: " + ex.getMessage());
//        }
//        req.setAttribute("start", start);
//        req.setAttribute("end", end);
//        getServletContext()
//                .getRequestDispatcher("/jsp2.jsp")
//                .forward(req, resp);
//    }
//}
