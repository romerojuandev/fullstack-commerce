package com.comercio.service.impl;

import com.comercio.entities.User;
import com.comercio.persistence.interfaces.IUserDAO;
import com.comercio.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    @Override
    public List<User> findAll() {
        return this.userDAO.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return this.userDAO.findById(id);
    }

    @Override
    public void save(User user) {
        this.userDAO.save(user);
    }

    @Override
    public void deleteById(Long id) {
        this.userDAO.deleteById(id);
    }
}
