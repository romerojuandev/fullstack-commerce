package com.comercio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permission {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Enumerated(EnumType.STRING)
   @Column(unique = true)
   private PermissionName name;

    public enum PermissionName {
        MODIFY_PRICE,
        MODIFY_STOCK,
        CREATE_PRODUCT,
        EDIT_PRODUCT,
        DELETE_PRODUCT
    }
}
