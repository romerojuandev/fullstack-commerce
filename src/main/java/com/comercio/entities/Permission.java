package com.comercio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
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

    public Permission() {
    }

    public Permission(Long id, PermissionName name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PermissionName getName() {
        return name;
    }

    public void setName(PermissionName name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Permission{id=" + id + ", name=" + name + '}';
    }
}
