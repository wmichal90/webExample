package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/runGet4")
public class runGet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> parameterMap = req.getParameterMap();
        for (Map.Entry<String, String[]> entry: parameterMap.entrySet()){
            String key = entry.getKey();
            String[] values = entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(key).append(":\n");
            for (String value: values){
                sb.append(" - ").append(value).append("\n");
            }
            resp.getWriter().append(String.format("%s", sb.toString()));
        }
    }
}
