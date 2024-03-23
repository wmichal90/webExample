package pl.coderslab.web.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post4")
public class Form4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double a = Double.parseDouble(req.getParameter("a"));
        double b = Double.parseDouble(req.getParameter("b"));
        double c = Double.parseDouble(req.getParameter("c"));


        double delta = b*b - 4 * a * c;
        if (delta < 0){
            resp.getWriter().write("Delta mniejsza od zera. Brak rzeczywistych rozwiązań");
        } else if (delta == 0){
            double x = -b / 2*a;
            resp.getWriter().write("Delta = 0. Rozwiazanie rowniania: " + x);
        } else{
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b - sqrtDelta) / (2*a);
            double x2 = (-b + sqrtDelta) / (2*a);
            resp.getWriter().write("Delta > 0. Pierwiastki rownania kwadratowego: x1 = " + x1 + " x2 = " + x2);
        }

    }
}
