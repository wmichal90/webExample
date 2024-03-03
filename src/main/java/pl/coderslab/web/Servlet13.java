package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;

public class Servlet13 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        LocalTime time = LocalTime.now();
        resp.getWriter().write("<h1>Current time: " + time + "</h1>");
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
//        import java.time.LocalTime;
//        import java.time.format.DateTimeFormatter;
//
//@WebServlet("/servlet13")
//public class Servlet13 extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        resp.getWriter().write(String.format("<h1>%s</h1>", LocalTime.now().format(DateTimeFormatter.ISO_TIME)));
//    }
//}
