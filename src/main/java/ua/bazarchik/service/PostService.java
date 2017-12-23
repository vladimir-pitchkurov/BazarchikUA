package ua.bazarchik.service;

import ua.bazarchik.model.UserPost;

import java.util.Collection;

public interface PostService {
    Collection<UserPost> getAllUserPosts(Integer userId);

    Collection<UserPost> getPostsByCategoryId(int idCategory);

    void savePost(Integer userId, UserPost post);

    UserPost getPostById(Long postId);

    void deletePost(Integer userId, Long id);
}
