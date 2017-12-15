package ua.bazarchik.model;

import java.time.LocalDateTime;


public class UserPost {
    private Long id;  /*https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html*/
    private String title;
    private int idCategory;
    private LocalDateTime registeredTime;
    private LocalDateTime unRegisteredTime;
    private String description;
    private Integer price;  /*в копейках*/
    private boolean active;

    public UserPost() {
    }

    public UserPost(Long id, String title) {
        this.id = id;
        this.title = title;
        this.registeredTime = LocalDateTime.now();
    }

    public UserPost(String title) {
        this.title = title;
        this.registeredTime = LocalDateTime.now();
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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
