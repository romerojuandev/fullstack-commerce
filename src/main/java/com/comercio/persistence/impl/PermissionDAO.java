package com.comercio.persistence.impl;

import com.comercio.entities.Permission;
import com.comercio.persistence.interfaces.IPermissionDAO;
import com.comercio.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PermissionDAO implements IPermissionDAO {

    @Autowired
    private PermissionRepository permissionRepository;


    @Override
    public List<Permission> findAll() {
        return (List<Permission>) this.permissionRepository.findAll();
    }

    @Override
    public Optional<Permission> findById(Long id) {
        return this.permissionRepository.findById(id);
    }

    @Override
    public void save(Permission permission) {
        this.permissionRepository.save(permission);
    }

    @Override
    public void deleteById(Long id) {
        this.permissionRepository.deleteById(id);
    }
}
