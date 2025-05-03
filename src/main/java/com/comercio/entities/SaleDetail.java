package com.comercio.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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

    @PrePersist
    @PreUpdate
    private void subtotal(){
        this.subtotal = unitaryPrice.multiply(BigDecimal.valueOf(quantity));
    }
}
