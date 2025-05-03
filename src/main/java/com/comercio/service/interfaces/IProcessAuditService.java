package com.comercio.service.interfaces;

import com.comercio.entities.ProcessAudit;

import java.util.List;
import java.util.Optional;

public interface IProcessAuditService {
    List<ProcessAudit> findAll();
    Optional<ProcessAudit> findById(Long id);
    void save(ProcessAudit processAudit);
    void deleteById(Long id);
}
