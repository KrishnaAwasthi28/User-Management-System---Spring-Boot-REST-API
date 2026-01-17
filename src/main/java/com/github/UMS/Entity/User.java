package com.github.UMS.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "user_email",unique = true,nullable = false)
    private String email;

    @Column(name = "mobile_no",unique = true)
    private String mobile;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @CreationTimestamp
    private LocalDateTime createdAt;


    public User(long id, String name, String email, String mobile, LocalDate birthDate, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.birthDate = birthDate;
        this.createdAt = createdAt;
    }
    public User(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
