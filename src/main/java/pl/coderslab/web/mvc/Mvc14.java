package pl.coderslab.web.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@WebServlet("/mvc14")
public class Mvc14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
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



        List<Book> bookList = (List<Book>) session.getAttribute("bookList");

        if (bookList == null){
            List<Book> newBookList = new ArrayList<>();
            newBookList.add(book);
            session.setAttribute("bookList", newBookList);
//            session.setAttribute(key, value);
//            resp.getWriter().write();
        } else {
            bookList.add(book);
            session.setAttribute("bookList", bookList);

        }
        getServletContext().getRequestDispatcher("/resultList.jsp").forward(req,resp);
    }
    }

