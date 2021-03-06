package ua.bazarchik.repository;

import ua.bazarchik.model.UserPost;

import java.util.Collection;
import java.util.List;

public interface PostRepo {
    Collection<UserPost> getAllUserPosts(Integer userId);

    Collection<UserPost> getPostsByCategoryId(int idCategory);

    void savePost(Integer userId, UserPost post);

    UserPost getPostById(Long postId);

    void deletePost(Integer userId, Long id);
}
