package com.comercio.persistence.impl;

import com.comercio.entities.StockAudit;
import com.comercio.persistence.interfaces.IStockAuditDAO;
import com.comercio.repository.StockAuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StockAuditDAO implements IStockAuditDAO {

    @Autowired
    private StockAuditRepository stockAuditRepository;

    @Override
    public List<StockAudit> findAll() {
        return (List<StockAudit>) this.stockAuditRepository.findAll();
    }

    @Override
    public Optional<StockAudit> findById(Long id) {
        return this.stockAuditRepository.findById(id);
    }

    @Override
    public void save(StockAudit stockAudit) {
        this.stockAuditRepository.save(stockAudit);
    }

    @Override
    public void deleteById(Long id) {
        this.stockAuditRepository.deleteById(id);
    }
}
