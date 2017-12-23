package ua.bazarchik.repository;

import org.springframework.stereotype.Repository;
import ua.bazarchik.model.UserPost;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class PostRepoImplMemor implements PostRepo {

    private Map<Long, UserPost> repository = new ConcurrentHashMap<>();
    private AtomicLong counter = new AtomicLong(0);

    {
        UserPost post = new UserPost(1l, "tovar1");
        post.setActive(true);
        post.setPrice(5000);
        post.setDescription("some product");
        repository.put(post.getId(), post);
        UserPost post2 = new UserPost(2l, "tovar2");
        post2.setActive(true);
        post2.setPrice(8000);
        post2.setDescription("some product2");
        repository.put(post2.getId(), post2);
        UserPost post11 = new UserPost("test post in service");
        post11.setId(3l);
        repository.put(3l, post11);

    }

    @Override
    public Collection<UserPost> getAllUserPosts(Integer userId) {
        return repository.values();
    }

    @Override
    public Collection<UserPost> getPostsByCategoryId(int idCategory) {
        return repository.values();
    }


    @Override
    public void savePost(Integer userId, UserPost post) {
        if (post.isNew()) {
            Long postId = counter.incrementAndGet();
            post.setId(postId);
        }
        repository.put(post.getId(), post);

    }


    @Override
    public UserPost getPostById(Long postId) {
        return repository.get(postId);
    }

    @Override
    public void deletePost(Integer userId, Long id) {
        repository.remove(id);

    }
}
