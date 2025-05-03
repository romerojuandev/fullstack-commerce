package com.comercio.persistence.interfaces;

import com.comercio.entities.StockAudit;

import java.util.List;
import java.util.Optional;

public interface IStockAuditDAO {
    List<StockAudit> findAll();
    Optional<StockAudit> findById(Long id);
    void save(StockAudit stockAudit);
    void deleteById(Long id);
}
