package pl.coderslab.web.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc13")
public class Mvc13 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        long isbn;
        try {
             isbn = Long.parseLong(req.getParameter("isbn"));

        } catch (NullPointerException exc){
             isbn = 0;
        } catch (NumberFormatException exc){
             isbn = -1;
        }
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setIsbn(isbn);
        req.setAttribute("Book", book);
        getServletContext().getRequestDispatcher("/result.jsp").forward(req,resp);

    }
}
