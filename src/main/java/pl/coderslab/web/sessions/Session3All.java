package pl.coderslab.web.sessions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Set;

@WebServlet("/showAllSessions")
public class Session3All extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session != null){
            Set<String> keys = (Set<String>) session.getAttribute("sessionKeys");
            for (String key: keys){
                resp.getWriter().write(String.format("<p>%s: %s</p>", key, session.getAttribute(key)));
            }

        }
    }
}

// do wykladowcy
//package pl.coderslab.web.session;
//
//        import javax.servlet.ServletException;
//        import javax.servlet.annotation.WebServlet;
//        import javax.servlet.http.HttpServlet;
//        import javax.servlet.http.HttpServletRequest;
//        import javax.servlet.http.HttpServletResponse;
//        import javax.servlet.http.HttpSession;
//        import java.io.IOException;
//        import java.util.Set;
//
//@WebServlet("/showAllSessions")
//public class Session3All extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpSession session = req.getSession(false);
//        if (session != null) {
//            Set<String> sessionKeys = (Set<String>) session.getAttribute("sessionKeys");
//            if (sessionKeys != null) {
//                for (String key : sessionKeys) {
//                    resp.getWriter().write( String.format("<p><div>%s - %s</div></p>", key, session.getAttribute(key)));
//                }
//            }
//        }
//    }
//}
