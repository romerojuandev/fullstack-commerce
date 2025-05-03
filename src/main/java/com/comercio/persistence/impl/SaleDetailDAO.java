package com.comercio.persistence.impl;

import com.comercio.entities.SaleDetail;
import com.comercio.persistence.interfaces.ISaleDetailDAO;
import com.comercio.repository.SaleDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SaleDetailDAO implements ISaleDetailDAO {

    @Autowired
    private SaleDetailRepository saleDetailRepository;

    @Override
    public List<SaleDetail> findAll() {
        return (List<SaleDetail>) this.saleDetailRepository.findAll();
    }

    @Override
    public Optional<SaleDetail> findById(Long id) {
        return this.saleDetailRepository.findById(id);
    }

    @Override
    public void save(SaleDetail saleDetail) {
        this.saleDetailRepository.save(saleDetail);
    }

    @Override
    public void deleteById(Long id) {
        this.saleDetailRepository.deleteById(id);
    }
}
