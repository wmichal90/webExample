package pl.coderslab.web.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/post1")
public class Form1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("Hello from");
        Map<String, String[]> parameterMap = req.getParameterMap();
        for (Map.Entry<String, String[]> entry: parameterMap.entrySet()){
            resp.getWriter().append(String.format("%s: %s", entry.getKey(), Arrays.toString(entry.getValue())));
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//            resp.getWriter().append(String.format("<div>%s = %s</div>\n", entry.getKey(), Arrays.toString(entry.getValue())));
        }

    }
}

//package pl.coderslab.web.post;
//
//        import javax.servlet.annotation.WebServlet;
//        import javax.servlet.http.HttpServlet;
//        import javax.servlet.http.HttpServletRequest;
//        import javax.servlet.http.HttpServletResponse;
//        import java.io.IOException;
//
//@WebServlet("/post1")
//public class Form1 extends HttpServlet {
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        String firstName = req.getParameter("firstName");
//        String lastName = req.getParameter("lastName");
//        resp.getWriter().write(String.format("Witaj, %s %s", firstName, lastName));
//    }
//}
