package ua.bazarchik.web;

import ua.bazarchik.model.TestUserWithList;
import ua.bazarchik.model.UserPost;
import ua.bazarchik.repository.PostRepo;
import ua.bazarchik.repository.PostRepoImplMemor;
import ua.bazarchik.service.PostServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {

    private PostRepo repository;

    @Override
    public void init() throws ServletException {
        repository = new PostRepoImplMemor();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("user", TestUserWithList.user);

        req.setAttribute("posts", TestUserWithList.user.getAllPosts());
        req.setAttribute("post11", repository.getAllUserPosts(1));
        req.getRequestDispatcher("second.jsp").forward(req, resp);
    }
}
