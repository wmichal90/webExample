package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get1")
public class Get1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int start = Integer.parseInt(req.getParameter("start"));
            int end = Integer.parseInt(req.getParameter("end"));
            for (int i = start; i <= end; i++){
                resp.getWriter().append("" + i + "\n");
            }
        } catch (Exception e){
            resp.getWriter().write(e.getMessage());
        }

    }
}

// od wykladowcy
//package pl.coderslab.web;
//
//        import javax.servlet.annotation.WebServlet;
//        import javax.servlet.http.HttpServlet;
//        import javax.servlet.http.HttpServletRequest;
//        import javax.servlet.http.HttpServletResponse;
//        import java.io.IOException;
//
//@WebServlet("/get1")
//public class Get1 extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        try {
//            int start = Integer.parseInt(req.getParameter("start"));
//            int end = Integer.parseInt(req.getParameter("end"));
//            for (int i = start; i <= end; i++) {
//                resp.getWriter().append(String.format("<div>%d</div><br>", i));
//            }
//        } catch (NumberFormatException ex) {
//            resp.getWriter().append("<h1>BRAK</h1>");
//        }
//    }
//}
