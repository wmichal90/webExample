package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get3")
public class Get3  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            int width = Integer.parseInt(req.getParameter("width")) ;
            int height = Integer.parseInt(req.getParameter("height")) ;

//            for (int h = 1; h <= height; h++){
//                for (int w = 1; w <= width; w++){
//                    resp.getWriter().write (String.format("%s\t", h*w));
//                }
//                resp.getWriter().write("\n");
////                resp.getWriter().append("\n");
//            }
            makeTable(height, width, resp);
        } catch (NumberFormatException e){
            makeTable(10, 5, resp);
//            resp.getWriter().write(e.getMessage());
        }
    }

    protected  void makeTable(int height, int width, HttpServletResponse resp) throws IOException{
        for (int h = 1; h <= height; h++){
            for (int w = 1; w <= width; w++){
                resp.getWriter().write (String.format("%s\t", h*w));
            }
            resp.getWriter().write("\n");
//                resp.getWriter().append("\n");
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
//@WebServlet("/get3")
//public class Get3 extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        try {
//            int width = Integer.parseInt(req.getParameter("width"));
//            int height = Integer.parseInt(req.getParameter("height"));
//            for (int h = 1; h <= height; h++) {
//                for (int w = 1; w <= width; w++) {
//                    resp.getWriter().append(String.format("%d ", w*h));
//                }
//                resp.getWriter().append("\n");
//            }
//        } catch (NumberFormatException ex) {
//            for (int h = 1; h <= 10; h++) {
//                for (int w = 1; w <= 5; w++) {
//                    resp.getWriter().append(String.format("%d ", w*h));
//                }
//                resp.getWriter().append("\n");
//            }
//        }
//    }
//}
