package com.github.UMS.DTO;

import java.time.LocalDate;

public class UpdateUsersDTO {
    private String name;
    private String email;
    private String mobile;
    private LocalDate birthDate;

    public UpdateUsersDTO(String name, String email, String mobile, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.birthDate = birthDate;
    }
    public UpdateUsersDTO(){}

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
