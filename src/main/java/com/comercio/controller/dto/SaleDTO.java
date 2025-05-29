package com.comercio.controller.dto;

import com.comercio.entities.Client;
import com.comercio.entities.SaleDetail;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SaleDTO {
    private Long id;
    private Client client;
    private List<SaleDetail> saleDetailList = new ArrayList<>();
    private LocalDateTime saleDate;
    private BigDecimal total;

    public SaleDTO() {
        this.saleDetailList = new ArrayList<>();
        this.total = BigDecimal.ZERO;
    }

    public SaleDTO(Long id, Client client, List<SaleDetail> saleDetailList, LocalDateTime saleDate, BigDecimal total) {
        this.id = id;
        this.client = client;
        this.saleDetailList = saleDetailList != null ? saleDetailList : new ArrayList<>();
        this.saleDate = saleDate;
        this.total = total != null ? total : BigDecimal.ZERO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<SaleDetail> getSaleDetailList() {
        return saleDetailList;
    }

    public void setSaleDetailList(List<SaleDetail> saleDetailList) {
        this.saleDetailList = saleDetailList != null ? saleDetailList : new ArrayList<>();
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total != null ? total : BigDecimal.ZERO;
    }
}
