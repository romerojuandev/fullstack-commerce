package com.comercio.persistence.interfaces;

import com.comercio.entities.Rol;

import java.util.List;
import java.util.Optional;

public interface IRolDAO {
    List<Rol> findAll();
    Optional<Rol> findById(Long id);
    void save(Rol rol);
    void deleteById(Long id);
}
