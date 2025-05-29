package com.comercio.controller.dto;

import com.comercio.entities.Rol;

import java.util.HashSet;
import java.util.Set;

public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private Set<Rol> rolls = new HashSet<>();

    public UserDTO() {
    }

    public UserDTO(Long id, String username, String password, String email, Set<Rol> rolls) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.rolls = rolls;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Rol> getRolls() {
        return rolls;
    }

    public void setRolls(Set<Rol> rolls) {
        this.rolls = rolls;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", rolls=" + rolls +
                '}';
    }
}
