package com.comercio.persistence.interfaces;

import com.comercio.entities.SaleDetail;

import java.util.List;
import java.util.Optional;

public interface ISaleDetailDAO {
    List<SaleDetail> findAll();
    Optional<SaleDetail> findById(Long id);
    void save(SaleDetail saleDetail);
    void deleteById(Long id);
}
