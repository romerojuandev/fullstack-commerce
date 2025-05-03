package com.comercio.persistence.interfaces;

import com.comercio.entities.Client;

import java.util.List;
import java.util.Optional;

public interface IClientDAO {
    List<Client> findAll();
    Optional<Client> findById(Long id);
    void save(Client client);
    void deleteById(Long id);
}
