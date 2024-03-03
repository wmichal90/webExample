package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String userAgent = req.getHeader("USER-AGENT");
        String ipAddress = req.getRemoteAddr();

        resp.getWriter().write(ipAddress);
        resp.getWriter().write("\n");
        resp.getWriter().write(userAgent);
    }
}
