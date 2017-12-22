package ua.bazarchik.web;

import ua.bazarchik.model.TestUserWithList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("user", TestUserWithList.user);
        req.setAttribute("posts", TestUserWithList.user.getAllPosts());
        req.getRequestDispatcher("second.jsp").forward(req, resp);
    }
}
