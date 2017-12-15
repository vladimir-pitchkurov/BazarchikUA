package ua.bazarchik.model;

import java.time.LocalDateTime;


public class UserPost {
    private Long id;
    private String title;
    private LocalDateTime registeredTime;
    private LocalDateTime unRegisteredTime;
    private String description;
    private Integer price;  /*в копейках*/

    public UserPost() {
    }

    public UserPost(Long id, String title) {
        this.id = id;
        this.title = title;
        this.registeredTime = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getRegisteredTime() {
        return registeredTime;
    }

    public void setRegisteredTime(LocalDateTime registeredTime) {
        this.registeredTime = registeredTime;
    }

    public LocalDateTime getUnRegisteredTime() {
        return unRegisteredTime;
    }

    public void setUnRegisteredTime(LocalDateTime unRegisteredTime) {
        this.unRegisteredTime = unRegisteredTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
