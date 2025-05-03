package com.comercio.service.impl;

import com.comercio.entities.SaleDetail;
import com.comercio.persistence.interfaces.ISaleDetailDAO;
import com.comercio.service.interfaces.ISaleDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaleDetailService implements ISaleDetailService {

    @Autowired
    private ISaleDetailDAO saleDetailDAO;

    @Override
    public List<SaleDetail> findAll() {
        return this.saleDetailDAO.findAll();
    }

    @Override
    public Optional<SaleDetail> findById(Long id) {
        return this.saleDetailDAO.findById(id);
    }

    @Override
    public void save(SaleDetail saleDetail) {
        this.saleDetailDAO.save(saleDetail);
    }

    @Override
    public void deleteById(Long id) {
        this.saleDetailDAO.deleteById(id);
    }
}
