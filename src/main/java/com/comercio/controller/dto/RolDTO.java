package com.comercio.controller.dto;

import com.comercio.entities.Permission;

import java.util.HashSet;
import java.util.Set;

public class RolDTO {
    private Long id;
    private RolName name;
    private Set<Permission> permissions = new HashSet<>();
    public enum RolName{
        ADMIN,
        PRODUCT_EDITOR,
        VISUALIZER
    }

    public RolDTO() {
    }

    public RolDTO(Long id, RolName name, Set<Permission> permissions) {
        this.id = id;
        this.name = name;
        this.permissions = permissions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RolName getName() {
        return name;
    }

    public void setName(RolName name) {
        this.name = name;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "RolDTO{" +
                "id=" + id +
                ", name=" + name +
                ", permissions=" + permissions +
                '}';
    }
}
