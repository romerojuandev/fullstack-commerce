package com.comercio.controller.dto;

import com.comercio.entities.Product;
import com.comercio.entities.User;

import java.time.LocalDateTime;

public class ProcessAuditDTO {
    private Long id;
    private Product product;
    private User user;
    private String action;
    private LocalDateTime dateTime;
    private String details;

    public ProcessAuditDTO() {
    }

    public ProcessAuditDTO(Long id, Product product, User user, String action, LocalDateTime dateTime, String details) {
        this.id = id;
        this.product = product;
        this.user = user;
        this.action = action;
        this.dateTime = dateTime;
        this.details = details;
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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "ProcessAuditDTO{" +
                "id=" + id +
                ", product=" + product +
                ", user=" + user +
                ", action='" + action + '\'' +
                ", dateTime=" + dateTime +
                ", details='" + details + '\'' +
                '}';
    }
}
