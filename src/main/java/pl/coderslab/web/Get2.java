package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/get2")
public class Get2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Map<String, String[]> parameterMap = req.getParameterMap();
        for (Map.Entry<String, String[]> entry: parameterMap.entrySet()){
            resp.getWriter().append(String.format("<div>%s = %s</div>\n", entry.getKey(), Arrays.toString(entry.getValue())));
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
//        import java.util.Arrays;
//        import java.util.Map;
//
//@WebServlet("/get2")
//public class Get2 extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        Map<String, String[]> parameterMap = req.getParameterMap();
//        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
//            resp.getWriter().append(String.format("<div>%s - %s</div>", entry.getKey(), Arrays.toString(entry.getValue())));
//        }
//    }
//}
