package com.comercio.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String cellphoneNumber;
    private String address;
}
