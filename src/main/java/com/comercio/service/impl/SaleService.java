package com.comercio.service.impl;

import com.comercio.controller.dto.SaleDetailDTO;
import com.comercio.entities.Client;
import com.comercio.entities.Product;
import com.comercio.entities.Sale;
import com.comercio.entities.SaleDetail;
import com.comercio.exceptions.ResourceNotFoundException;
import com.comercio.persistence.interfaces.IClientDAO;
import com.comercio.persistence.interfaces.IProductDAO;
import com.comercio.persistence.interfaces.ISaleDAO;
import com.comercio.persistence.interfaces.ISaleDetailDAO;
import com.comercio.service.interfaces.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SaleService implements ISaleService {

    private final ISaleDAO saleDAO;
    private final IClientDAO clientDAO;
    private final IProductDAO productDAO;
    private final ISaleDetailDAO saleDetailDAO;

    @Autowired
    public SaleService(ISaleDAO saleDAO, IClientDAO clientDAO, IProductDAO productDAO, ISaleDetailDAO saleDetailDAO){
        this.saleDAO = saleDAO;
        this.clientDAO = clientDAO;
        this.productDAO = productDAO;
        this.saleDetailDAO = saleDetailDAO;
    }

    public Sale createSale(Long clientID, List<SaleDetailDTO> details){

        Client client = clientDAO.findById(clientID)
                .orElseThrow(() -> new ResourceNotFoundException("Client not found"));

        Sale sale = new Sale();
        sale.setClient(client);
        sale.setSaleDate(LocalDateTime.now());
        sale.setSaleDetailList(new ArrayList<>());
        BigDecimal totalSale = BigDecimal.ZERO;

        for(SaleDetailDTO detail : details){
            Product product = productDAO.findById(detail.getId())
                    .orElseThrow(() -> new ResourceNotFoundException("Product not found"));

            if(product.getStock() < detail.getQuantity()){
                throw new ResourceNotFoundException("Insufficient stock");
            }

            SaleDetail saleDetail = new SaleDetail();
            saleDetail.setSale(sale);
            saleDetail.setProduct(product);
            saleDetail.setUnitaryPrice(product.getPrice());
            saleDetail.setQuantity(detail.getQuantity());
            saleDetail.subtotal();

            sale.getSaleDetailList().add(saleDetail);
            totalSale = totalSale.add(saleDetail.getSubtotal());

            product.setStock(product.getStock() - detail.getQuantity());
            productDAO.save(product);
        }

        sale.setTotal(totalSale);

        return sale;
    }

    @Override
    public List<Sale> findAll() {
        return this.saleDAO.findAll();
    }

    @Override
    public Optional<Sale> findById(Long id) {
        return this.saleDAO.findById(id);
    }

    @Override
    public Sale save(Sale sale) {
        this.saleDAO.save(sale);
        return sale;
    }

    @Override
    public void deleteById(Long id) {
        this.saleDAO.deleteById(id);
    }
}
