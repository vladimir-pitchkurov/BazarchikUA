package ua.bazarchik;

import ua.bazarchik.model.UserPost;

import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        UserPost post = new UserPost( 1l, "aaa");
        System.out.println(post.getRegisteredTime());
    }
}
