package com.comercio.service.impl;

import com.comercio.entities.Permission;
import com.comercio.persistence.interfaces.IPermissionDAO;
import com.comercio.service.interfaces.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermissionService implements IPermissionService {

    @Autowired
    private IPermissionDAO permissionDAO;

    @Override
    public List<Permission> findAll() {
        return this.permissionDAO.findAll();
    }

    @Override
    public Optional<Permission> findById(Long id) {
        return this.permissionDAO.findById(id);
    }

    @Override
    public void save(Permission permission) {
        this.permissionDAO.save(permission);
    }

    @Override
    public void deleteById(Long id) {
        this.permissionDAO.deleteById(id);
    }
}
