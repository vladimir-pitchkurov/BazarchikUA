package ua.bazarchik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ua.bazarchik.model.UserPost;
import ua.bazarchik.repository.PostRepo;
import ua.bazarchik.repository.PostRepoImplMemor;

import java.util.Collection;

@Service
public class PostServiceImpl implements PostService {
    private final PostRepo repository;

    @Autowired
    public PostServiceImpl() {
        this.repository = new PostRepoImplMemor();
    }

    @Override
    public Collection<UserPost> getAllUserPosts(Integer userId) {
        return repository.getAllUserPosts(userId);
    }

    @Override
    public Collection<UserPost> getPostsByCategoryId(int idCategory) {
        return repository.getPostsByCategoryId(idCategory);
    }

    @Override
    public void savePost(Integer userId, UserPost post) {
        repository.savePost(userId, post);
    }

    @Override
    public UserPost getPostById(Long postId) {
        return repository.getPostById(postId);
    }

    @Override
    public void deletePost(Integer userId, Long id) {
        repository.deletePost(userId, id);
    }
}
