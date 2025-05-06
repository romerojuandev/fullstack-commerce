package com.comercio.controller.dto;

import com.comercio.entities.Product;
import com.comercio.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
