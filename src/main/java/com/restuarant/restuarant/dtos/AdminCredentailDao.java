package com.restuarant.restuarant.dtos;

import com.restuarant.restuarant.userdetails.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class AdminCredentailDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void createTableAdminCredentail() {
        var query = "Create table AdminCredentails(userID varchar(255), password varchar(255))";
        int a = this.jdbcTemplate.update(query);
        System.out.println("created");
    }

    public void insertAdminDetails(String userID, String password) {
        var query = "insert into AdminCredentails(userID,password) values(?,?)";
        jdbcTemplate.update(query, userID, password);
        System.out.println("value inserted");

    }
    public void createTableUserDetails() {
        var query = "Create table UserDetails(firstName varchar(255), middleName varchar(255),lastName varchar(255),addressLine1 varchar(255),addressLine2 varchar(255),addressLine3 varchar(255),refferalCode varchar(255),promoCode varchar(255))";
        int a = this.jdbcTemplate.update(query);
        System.out.println("created");
    }
    public void createTableUserCredentail() {
        var query = "Create table UserCredentail(emailID varchar(255) NOT NULL,password varchar(255) PRIMARY KEY)";
        int a = this.jdbcTemplate.update(query);
        System.out.println("created");
    }
    public void insertUserCredentail(UserCredential userCredential) {
        var query = "insert into UserCredentail(emailID,password) values(?,?)";
        jdbcTemplate.update(query, userCredential.getEmailId(),  userCredential.getPassword());
        System.out.println("Login Successfully");
    }
    public  List<Map<String, Object>> getUserDetails() {
        var query = "Select * from UserDetails";
        return jdbcTemplate.queryForList(query);
    }
    public void insertUserDetails(UserInformation userInformation ) {
        UserNames userNames=userInformation.getUserNames();
        Address address=userInformation.getAddress();
        AdditionalUserDetails additionalUserDetails=userInformation.getAdditionalUserDetails();
        var query = "insert into UserDetails(firstName,middleName,lastName,addressLine1,addressLine2,addressLine3,refferalCode,promoCode) values(?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(query, userNames.getFirstName(),  userNames.getMiddleName(), userNames.getLastName(),
                address.getAddressLine1(),address.getAddressLine2(),address.getAddressLine3(),additionalUserDetails.getRefferalCode(),additionalUserDetails.getPromoCode());
        System.out.println("value inserted in UserDetails tabele");

    }
}
