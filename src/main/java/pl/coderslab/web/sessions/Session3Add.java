package pl.coderslab.web.sessions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


@WebServlet("/addToSession")
public class Session3Add extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String key = req.getParameter("key");
        String value = req.getParameter("value");
        Set<String> sessionKeys = (Set<String>) session.getAttribute("sessionKeys");

        if (sessionKeys == null){
            Set<String> newListKeys = new HashSet<>();
            newListKeys.add(key);
            session.setAttribute("sessionKeys", newListKeys);
            session.setAttribute(key, value);
//            resp.getWriter().write();
        } else {
            sessionKeys.add(key);
            session.setAttribute("sessionKeys", sessionKeys);
            session.setAttribute(key, value);
        }
        resp.sendRedirect("/showAllSessions");
    }
}


// od wykladowcy
//package pl.coderslab.web.session;
//
//        import javax.servlet.annotation.WebServlet;
//        import javax.servlet.http.HttpServlet;
//        import javax.servlet.http.HttpServletRequest;
//        import javax.servlet.http.HttpServletResponse;
//        import javax.servlet.http.HttpSession;
//        import java.io.IOException;
//        import java.util.HashSet;
//        import java.util.Set;
//
//@WebServlet("/addToSession")
//public class Session3Add extends HttpServlet {
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        HttpSession session = req.getSession();
//        Set<String> sessionKeys = (Set<String>) session.getAttribute("sessionKeys");
//
//        String key = req.getParameter("key");
//        String value = req.getParameter("value");
//
//        session.getAttributeNames();
//
//        if (sessionKeys == null) {
//            Set<String> newSessionKeys = new HashSet<>();
//            newSessionKeys.add(key);
//            session.setAttribute("sessionKeys", newSessionKeys);
//            session.setAttribute(key, value);
//        } else {
//            sessionKeys.add(key);
//            session.setAttribute("sessionKeys", sessionKeys);
//            session.setAttribute(key, value);
//        }
//        resp.sendRedirect("/showAllSessions");
//    }
//}