package com.comercio.service.impl;

import com.comercio.entities.Client;
import com.comercio.persistence.interfaces.IClientDAO;
import com.comercio.service.interfaces.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements IClientService {

    @Autowired
    private IClientDAO clientDAO;


    @Override
    public List<Client> findAll() {
        return this.clientDAO.findAll();
    }

    @Override
    public Optional<Client> findById(Long id) {
        return this.clientDAO.findById(id);
    }

    @Override
    public void save(Client client) {
        this.clientDAO.save(client);
    }

    @Override
    public void deleteById(Long id) {
        this.clientDAO.deleteById(id);
    }
}
