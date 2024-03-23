package pl.coderslab.web.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

@WebServlet("/post2")
public class Form2 extends HttpServlet {

    private static final Set<String> NOT_ALLOWED_WORDS = Set.of("cholera");
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text = req.getParameter("tekst");
        boolean isAware = Boolean.parseBoolean(req.getParameter("isAware"));
        System.out.println("hello from post2");

        if (isAware){
            resp.getWriter().write(text);
        } else {
            String result = text;
            String[] words = text.split(" ");
            for (String word: words){
                if (NOT_ALLOWED_WORDS.contains(word.toLowerCase())){
                    result = text.replace(word, "*".repeat(word.length()));
                }
            }
            resp.getWriter().write(result);
        }

    }
}
