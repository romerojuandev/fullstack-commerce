package com.comercio.controller.dto;

import com.comercio.entities.Client;
import com.comercio.entities.SaleDetail;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleDTO {
    private Long id;
    private Client client;
    private List<SaleDetail> saleDetailList = new ArrayList<>();
    private LocalDateTime saleDate;
    private BigDecimal total;
    @PrePersist
    protected void onCreate(){
        saleDate = LocalDateTime.now();
    }
}
