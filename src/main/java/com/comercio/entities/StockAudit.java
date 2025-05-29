package com.comercio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
public class StockAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private LocalDateTime dateTime;
    private Integer quantity;
    private Integer totalStock;

    @PrePersist
    protected void onCreate(){
        dateTime = LocalDateTime.now();
    }

    public StockAudit() {
    }

    public StockAudit(Product product, User user, Integer quantity, Integer totalStock) {
        this.product = product;
        this.user = user;
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
        return "StockAudit{" +
                "id=" + id +
                ", product=" + product +
                ", user=" + user +
                ", dateTime=" + dateTime +
                ", quantity=" + quantity +
                ", totalStock=" + totalStock +
                '}';
    }
}
