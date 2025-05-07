package com.comercio.controller;

import com.comercio.controller.dto.SaleDetailDTO;
import com.comercio.entities.Sale;
import com.comercio.exceptions.ResourceNotFoundException;
import com.comercio.service.impl.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/sale")
public class SaleController {

    private final SaleService saleService;

    @Autowired
    SaleController(SaleService saleService){
        this.saleService = saleService;
    }

    @PostMapping("/save")
    public ResponseEntity<Sale> createSale(@RequestParam Long clientId, @RequestBody List<SaleDetailDTO> details){

        try{
            Sale newSale = this.saleService.createSale(clientId, details);
            return new ResponseEntity<>(newSale, HttpStatus.CREATED);
        } catch (ResourceNotFoundException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
