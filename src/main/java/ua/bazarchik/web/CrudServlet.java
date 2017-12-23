package ua.bazarchik.web;

import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import ua.bazarchik.model.UserPost;

import ua.bazarchik.service.PostService;
import ua.bazarchik.service.PostServiceImpl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.Objects;

import static org.slf4j.LoggerFactory.getLogger;

public class CrudServlet extends HttpServlet {
    private PostService postService;
    private static final Logger LOG = getLogger(CrudServlet.class);


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        postService = new PostServiceImpl();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");

        switch (action == null ? "all" : action) {
            case "delete":
                Long id = getId(req);
                LOG.info("Delete {}", id);
                postService.deletePost(1, id);
                resp.sendRedirect("/crud");
                break;

            case "create":
            case "update":
                final UserPost post = "create".equals(action) ?
                        new UserPost() :
                        postService.getPostById(getId(req));
                req.setAttribute("post", post);
                req.getRequestDispatcher("createpostform.jsp").forward(req, resp);
                break;

            case "all":
            default:
                LOG.info("getAll");
                req.setAttribute("posts",
                        postService.getAllUserPosts(1));
                req.getRequestDispatcher("/jspcrud.jsp").forward(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");

        UserPost post = new UserPost(id.isEmpty() ? null : Long.valueOf(id),
                req.getParameter("title"));

        LOG.info(post.isNew() ? "Create {}" : "Update {}", post);
        postService.savePost(1, post);
        resp.sendRedirect("crud");
    }

    private Long getId(HttpServletRequest request) {
        String paramId = Objects.requireNonNull(request.getParameter("id"));
        return Long.valueOf(paramId);
    }
}
