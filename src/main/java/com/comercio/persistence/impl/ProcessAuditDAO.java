package com.comercio.persistence.impl;

import com.comercio.entities.ProcessAudit;
import com.comercio.persistence.interfaces.IProcessAuditDAO;
import com.comercio.repository.ProcessAuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProcessAuditDAO implements IProcessAuditDAO {

    @Autowired
    private ProcessAuditRepository processAuditRepository;

    @Override
    public List<ProcessAudit> findAll() {
        return (List<ProcessAudit>) this.processAuditRepository.findAll();
    }

    @Override
    public Optional<ProcessAudit> findById(Long id) {
        return this.processAuditRepository.findById(id);
    }

    @Override
    public void save(ProcessAudit processAudit) {
        this.processAuditRepository.save(processAudit);
    }

    @Override
    public void deleteById(Long id) {
        this.processAuditRepository.deleteById(id);
    }
}
