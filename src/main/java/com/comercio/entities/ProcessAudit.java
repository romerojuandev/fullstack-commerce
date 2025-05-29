package com.comercio.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
public class ProcessAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @NotBlank
    private String action;
    private LocalDateTime dateTime;
    @NotBlank
    private String details;

    public ProcessAudit() {
    }

    public ProcessAudit(Product product, User user, String action, LocalDateTime dateTime, String details) {
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
        return "ProcessAudit{" +
                "id=" + id +
                ", product=" + product +
                ", user=" + user +
                ", action='" + action + '\'' +
                ", dateTime=" + dateTime +
                ", details='" + details + '\'' +
                '}';
    }

    @PrePersist
    protected void onCreate(){
        dateTime = LocalDateTime.now();
    }
}
