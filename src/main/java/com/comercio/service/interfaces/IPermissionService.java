package com.comercio.service.interfaces;

import com.comercio.entities.Permission;

import java.util.List;
import java.util.Optional;

public interface IPermissionService {
    List<Permission> findAll();
    Optional<Permission> findById(Long id);
    void save(Permission permission);
    void deleteById(Long id);
}
