package com.comercio.controller.dto;

import com.comercio.entities.Product;
import com.comercio.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessAuditDTO {
    private Long id;
    private Product product;
    private User user;
    private String action;
    private LocalDateTime dateTime;
    private String details;
}
