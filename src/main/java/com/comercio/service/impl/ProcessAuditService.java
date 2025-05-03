package com.comercio.service.impl;

import com.comercio.entities.ProcessAudit;
import com.comercio.persistence.interfaces.IProcessAuditDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProcessAuditService implements IProcessAuditDAO{

    @Autowired
    private IProcessAuditDAO processAuditDAO;

    @Override
    public List<ProcessAudit> findAll() {
        return this.processAuditDAO.findAll();
    }

    @Override
    public Optional<ProcessAudit> findById(Long id) {
        return this.processAuditDAO.findById(id);
    }

    @Override
    public void save(ProcessAudit processAudit) {
        this.processAuditDAO.save(processAudit);
    }

    @Override
    public void deleteById(Long id) {
        this.processAuditDAO.deleteById(id);
    }
}
