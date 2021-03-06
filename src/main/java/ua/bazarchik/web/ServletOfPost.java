package ua.bazarchik.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletOfPost extends HttpServlet {

    private static final Logger LOG = LoggerFactory.getLogger(ServletOfPost.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOG.info("redirect to usersPost");
        req.getRequestDispatcher("firstPage.jsp").forward(req, resp);
    }
}
