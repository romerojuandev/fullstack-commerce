package com.comercio.persistence.impl;

import com.comercio.entities.Rol;
import com.comercio.persistence.interfaces.IRolDAO;
import com.comercio.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RolDAO implements IRolDAO {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> findAll() {
        return (List<Rol>) this.rolRepository.findAll();
    }

    @Override
    public Optional<Rol> findById(Long id) {
        return this.rolRepository.findById(id);
    }

    @Override
    public void save(Rol rol) {
        this.rolRepository.save(rol);
    }

    @Override
    public void deleteById(Long id) {
        this.rolRepository.deleteById(id);
    }
}
