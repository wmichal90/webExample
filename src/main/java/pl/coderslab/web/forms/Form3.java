package pl.coderslab.web.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpClient;

@WebServlet("/getForm3")
public class Form3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int page = Integer.parseInt( req.getParameter("page"));
        resp.getWriter().write("Dzielniki calkowite liczby: " + page + " to: ");
        for (int i = 1; i<= page; i++){
            if (page % i == 0){
                resp.getWriter().write("" + i + ", ");
            }
        }
    }
}
