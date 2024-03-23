package pl.coderslab.web.sessions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/session2")
public class Session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        int mark = Integer.parseInt( req.getParameter("mark"));

        List<Integer> marks = (List<Integer>) session.getAttribute("marks");

        if (marks == null){
            List<Integer> newList = new ArrayList<>();
            newList.add(mark);
            session.setAttribute("marks", newList);
            resp.getWriter().write(String.format("<p>GRADES: %s</p><p>AVERAGE: %s</p>", newList, mark));
        } else{
            marks.add(mark);
            session.setAttribute("marks", marks);
            int sum = 0;
            for (int i: marks){
                sum+=i;
            }
            double avg = (double) sum / marks.size();
            resp.getWriter().write(String.format("<p>GRADES: %s</p><p>AVERAGE: %s</p>", marks, avg));
        }
    }
}
