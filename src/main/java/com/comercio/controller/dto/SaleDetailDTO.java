package com.comercio.controller.dto;

public class SaleDetailDTO {
    private Long id;
    private Integer quantity;

    public SaleDetailDTO() {}

    // Constructor con parámetros
    public SaleDetailDTO(Long id, Integer quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    // Getter para id
    public Long getId() {
        return id;
    }

    // Setter para id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para quantity
    public Integer getQuantity() {
        return quantity;
    }

    // Setter para quantity
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
