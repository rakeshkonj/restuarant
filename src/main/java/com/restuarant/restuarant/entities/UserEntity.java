package com.restuarant.restuarant.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;


import java.io.Serializable;

@Getter
@Entity
@Table(name = "USERS")
public class UserEntity implements Serializable {

    // READ THE DIFFERENT TYPES OF GENERATIONTYPE
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;

    @NotNull
    @Column(name = "USER_NAME", nullable = false)
    private String userName;

    @NotNull
    @Column(name = "EMAIL_ADDRESS", nullable = false)
    private String emailAddress;

    @NotNull
    @Column(name = "PASSWORD",nullable = false)
    private  String password;

    @NotNull
    @Column(name = "MOBILE_NUMBER",nullable = false)
    private String mobileNumber;

}
