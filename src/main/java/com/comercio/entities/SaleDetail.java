package com.comercio.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

@Entity
public class SaleDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "sale_id")
    private Sale sale;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @NotNull
    @Positive
    private Integer quantity;
    @NotNull
    private BigDecimal unitaryPrice;
    private BigDecimal subtotal;

    public SaleDetail() {}

    // Constructor con parámetros
    public SaleDetail(Sale sale, Product product, Integer quantity, BigDecimal unitaryPrice) {
        this.sale = sale;
        this.product = product;
        this.quantity = quantity;
        this.unitaryPrice = unitaryPrice;
        this.subtotal = unitaryPrice.multiply(BigDecimal.valueOf(quantity));
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
        this.subtotal = unitaryPrice.multiply(BigDecimal.valueOf(quantity));
    }

    public BigDecimal getUnitaryPrice() {
        return unitaryPrice;
    }

    public void setUnitaryPrice(BigDecimal unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
        this.subtotal = unitaryPrice.multiply(BigDecimal.valueOf(quantity));
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }


    @PrePersist
    @PreUpdate
    public void subtotal(){
        this.subtotal = unitaryPrice.multiply(BigDecimal.valueOf(quantity));
    }
}
