package ua.bazarchik.repository;

import ua.bazarchik.model.UserPost;

import java.util.List;

public interface PostRepo {
    List<UserPost> getAllUserPosts(Integer userId);
    List<UserPost> getPostsByCategoryId(int idCategory);
    Long addPost(Integer userId);
    Long updatePost(Integer userId, Long postId);
    UserPost getPostById(Long postId);
    Long deletePost(Integer userId, Long id);
}
