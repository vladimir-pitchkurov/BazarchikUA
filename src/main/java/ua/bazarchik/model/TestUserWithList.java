package ua.bazarchik.model;

import java.util.ArrayList;

public class TestUserWithList {
    public static User user;
    static {
        User user1 = new User("aaa@gmail.com", "0000");
        user1.setId(1);
        ArrayList<UserPost>posts = new ArrayList<>();
        UserPost post = new UserPost(1l, "tovar1" );
        post.setActive(true);
        post.setPrice(5000);
        post.setDescription("some product");
        posts.add(post);
        UserPost post2 = new UserPost(2l, "tovar2" );
        post2.setActive(true);
        post2.setPrice(8000);
        post2.setDescription("some product2");
        posts.add(post2);
        user1.setAllPosts(posts);
        user = user1;
    }
}
