package com.comercio.service.impl;

import com.comercio.entities.Product;
import com.comercio.persistence.interfaces.IProductDAO;
import com.comercio.service.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductDAO productDAO;

    @Override
    public List<Product> findAll() {
        return this.productDAO.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return this.productDAO.findById(id);
    }

    @Override
    public void save(Product product) {
        this.productDAO.save(product);
    }

    @Override
    public void deleteById(Long id) {
        this.productDAO.deleteById(id);
    }
}
