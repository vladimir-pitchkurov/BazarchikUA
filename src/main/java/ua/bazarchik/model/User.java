package ua.bazarchik.model;

import java.time.LocalDateTime;
import java.util.List;

public class User {
    private Integer id;
    private String email;
    private String password;
    private List<UserPost>allPosts;
    private LocalDateTime registrationTime;
    private LocalDateTime lastVisit;

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.registrationTime = LocalDateTime.now();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<UserPost> getAllPosts() {
        return allPosts;
    }

    public void setAllPosts(List<UserPost> allPosts) {
        this.allPosts = allPosts;
    }

    public LocalDateTime getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(LocalDateTime registrationTime) {
        this.registrationTime = registrationTime;
    }

    public LocalDateTime getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(LocalDateTime lastVisit) {
        this.lastVisit = lastVisit;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", allPosts=" + allPosts +
                ", registrationTime=" + registrationTime +
                ", lastVisit=" + lastVisit +
                '}';
    }
}
