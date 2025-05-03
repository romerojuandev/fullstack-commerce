package com.comercio.persistence.interfaces;

import com.comercio.entities.Permission;

import java.util.List;
import java.util.Optional;

public interface IPermissionDAO {
    List<Permission> findAll();
    Optional<Permission> findById(Long id);
    void save(Permission permission);
    void deleteById(Long id);
}
