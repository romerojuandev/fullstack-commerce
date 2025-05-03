package com.comercio.service.interfaces;

import com.comercio.entities.SaleDetail;

import java.util.List;
import java.util.Optional;

public interface ISaleDetailService {
    List<SaleDetail> findAll();
    Optional<SaleDetail> findById(Long id);
    void save(SaleDetail saleDetail);
    void deleteById(Long id);
}
