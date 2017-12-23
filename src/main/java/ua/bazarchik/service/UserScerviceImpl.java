package ua.bazarchik.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.bazarchik.model.User;
import ua.bazarchik.repository.UserRepo;
import ua.bazarchik.util.exceptions.NotFoundException;

import java.util.List;

public class UserScerviceImpl implements UserService {
    private UserRepo repository;
    private static final Logger LOG = LoggerFactory.getLogger(UserScerviceImpl.class);
    @Override
    public User create(User user) {

        return null;
    }

    @Override
    public void delete(int id) throws NotFoundException {

    }

    @Override
    public User get(int id) throws NotFoundException {
        return null;
    }

    @Override
    public User getByEmail(String email) throws NotFoundException {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
