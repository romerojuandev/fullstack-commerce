package com.comercio.persistence.interfaces;

import com.comercio.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserDAO {
    List<User> findAll();
    Optional<User> findById(Long id);
    void save(User user);
    void deleteById(Long id);
}
