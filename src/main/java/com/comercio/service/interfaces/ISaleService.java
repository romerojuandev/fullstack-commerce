package com.comercio.service.interfaces;

import com.comercio.entities.Sale;

import java.util.List;
import java.util.Optional;

public interface ISaleService {
    List<Sale> findAll();
    Optional<Sale> findById(Long id);
    Sale save(Sale sale);
    void deleteById(Long id);
}
