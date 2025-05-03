package com.comercio.service.impl;

import com.comercio.entities.StockAudit;
import com.comercio.persistence.interfaces.IStockAuditDAO;
import com.comercio.service.interfaces.IStockAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockAuditService implements IStockAuditService {

    @Autowired
    private IStockAuditDAO stockAuditDAO;

    @Override
    public List<StockAudit> findAll() {
        return this.stockAuditDAO.findAll();
    }

    @Override
    public Optional<StockAudit> findById(Long id) {
        return this.stockAuditDAO.findById(id);
    }

    @Override
    public void save(StockAudit stockAudit) {
        this.stockAuditDAO.save(stockAudit);
    }

    @Override
    public void deleteById(Long id) {
        this.stockAuditDAO.deleteById(id);
    }
}
