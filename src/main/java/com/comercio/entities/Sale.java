package com.comercio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SaleDetail> saleDetailList = new ArrayList<>();
    private LocalDateTime saleDate;
    private BigDecimal total;

    public Sale() {
        this.saleDetailList = new ArrayList<>();
        this.total = BigDecimal.ZERO;
    }

    public Sale(Long id, Client client, List<SaleDetail> saleDetailList, LocalDateTime saleDate, BigDecimal total) {
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

    @PrePersist
    protected void onCreate(){
        saleDate = LocalDateTime.now();
    }
}
