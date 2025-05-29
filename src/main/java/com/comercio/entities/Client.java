package com.comercio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Client {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @NotBlank
        private String name;
        @NotBlank
        private String surname;
        @Email
        private String email;
        private String cellphoneNumber;
        private String address;

        public Client() {}

        // Constructor con todos los atributos
        public Client(Long id, String name, String surname, String email, String cellphoneNumber, String address) {
                this.id = id;
                this.name = name;
                this.surname = surname;
                this.email = email;
                this.cellphoneNumber = cellphoneNumber;
                this.address = address;
        }

        // Getters y Setters
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getSurname() {
                return surname;
        }

        public void setSurname(String surname) {
                this.surname = surname;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getCellphoneNumber() {
                return cellphoneNumber;
        }

        public void setCellphoneNumber(String cellphoneNumber) {
                this.cellphoneNumber = cellphoneNumber;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }
}
