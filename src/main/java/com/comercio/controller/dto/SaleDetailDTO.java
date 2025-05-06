package com.comercio.controller.dto;

import com.comercio.entities.Product;
import com.comercio.entities.Sale;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleDetailDTO {
    private Long id;
    private Sale sale;
    private Product product;
    private Integer quantity;
    private BigDecimal unitaryPrice;
    private BigDecimal subtotal;

    private void subtotal(){
        this.subtotal = unitaryPrice.multiply(BigDecimal.valueOf(quantity));
    }
}
