package ua.bazarchik.repository;

import ua.bazarchik.model.User;

public interface UserRepo {
    User loggedUser(User loggedUser);

    Integer getUser(Integer id);

    Integer deleteUser(Integer id, boolean isAdmin);
}
