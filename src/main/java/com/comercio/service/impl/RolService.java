package com.comercio.service.impl;

import com.comercio.entities.Rol;
import com.comercio.persistence.interfaces.IRolDAO;
import com.comercio.service.interfaces.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolService implements IRolService {

    @Autowired
    private IRolDAO rolDAO;

    @Override
    public List<Rol> findAll() {
        return this.rolDAO.findAll();
    }

    @Override
    public Optional<Rol> findById(Long id) {
        return this.rolDAO.findById(id);
    }

    @Override
    public void save(Rol rol) {
        this.rolDAO.save(rol);
    }

    @Override
    public void deleteById(Long id) {
        this.rolDAO.deleteById(id);
    }
}
