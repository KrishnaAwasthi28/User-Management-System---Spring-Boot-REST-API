package com.github.UMS.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class UserDTO {
    @NotBlank(message = "Name cannot be null")
    private String name;
    @Email
    @NotBlank(message = "Email cannot be null")
    private String email;
    private String mobile;
    private LocalDate birthDate;

    public UserDTO(String name, String email, String mobile, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.birthDate = birthDate;
    }
    public UserDTO(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
