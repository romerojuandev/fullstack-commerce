package com.comercio.controller.dto;

import com.comercio.entities.Product;
import com.comercio.entities.User;

import java.time.LocalDateTime;

public class StockAuditDTO {
    private Long id;
    private Product product;
    private User user;
    private LocalDateTime dateTime;
    private Integer quantity;
    private Integer totalStock;

    protected void onCreate(){
        dateTime = LocalDateTime.now();
    }

    public StockAuditDTO() {
    }

    public StockAuditDTO(Long id, Product product, User user, LocalDateTime dateTime, Integer quantity, Integer totalStock) {
        this.id = id;
        this.product = product;
        this.user = user;
        this.dateTime = dateTime;
        this.quantity = quantity;
        this.totalStock = totalStock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(Integer totalStock) {
        this.totalStock = totalStock;
    }

    @Override
    public String toString() {
        return "StockAuditDTO{" +
                "id=" + id +
                ", product=" + product +
                ", user=" + user +
                ", dateTime=" + dateTime +
                ", quantity=" + quantity +
                ", totalStock=" + totalStock +
                '}';
    }
}
