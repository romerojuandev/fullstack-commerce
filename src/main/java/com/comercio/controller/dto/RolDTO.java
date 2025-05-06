package com.comercio.controller.dto;

import com.comercio.entities.Permission;
import com.comercio.entities.Rol;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolDTO {
    private Long id;
    private RolName name;
    private Set<Permission> permissions = new HashSet<>();
    public enum RolName{
        ADMIN,
        PRODUCT_EDITOR,
        VISUALIZER
    }
}
