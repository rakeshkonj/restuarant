package com.restuarant.restuarant.controller;


import com.restuarant.restuarant.dtos.AdminCredentailDao;
import com.restuarant.restuarant.userdetails.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/restuarant")
public class Restuarant {
    @Autowired
    AdditionalUserDetails additionalUserDetails;
    @Autowired
    UserNames userNames;
    @Autowired
    Address address;
    @Autowired
    AdminCredential adminCredential;
    @Autowired
    AdminCredentailDao adminCredentailDao;

    @GetMapping("/login")
    private List<AdminCredential> login() {
        AdminCredential adminCredential2 = new AdminCredential();
        adminCredential.setPassword("abcpass");
        adminCredential.setUserID("aman123");
        adminCredential2.setPassword("xyz");
        adminCredential2.setUserID("anand123");
        List<AdminCredential> l = new ArrayList<>();
        l.add(adminCredential);
        l.add(adminCredential2);
        return l;
    }

    @PostMapping("/validate")
    public ResponseEntity<String> validate(@RequestBody List<AdminCredential> adminCredentialList) {
        if (adminCredentialList.get(0).getUserID().equals("aman123") && adminCredentialList.get(0).getPassword().equals("pass123")) {
            return new ResponseEntity<>("Successfully login", HttpStatus.ACCEPTED);
        }

        return new ResponseEntity<>("Wrong Password", HttpStatus.UNAUTHORIZED);
    }

    @GetMapping("/createUsers")
    public ResponseEntity<UserInformation> createUsers() {
        userNames.setFirstName("AMan");
        userNames.setMiddleName("Kumar");
        userNames.setLastName("Sahani");

        address.setAddressLine1("HanumanPura");
        address.setAddressLine2("Bhelupur");
        address.setAddressLine3("Varanasi");
        additionalUserDetails.setPromoCode("apply50%CODE");
        additionalUserDetails.setRefferalCode("AMANXCB");
        UserInformation userInformation = new UserInformation(userNames, address, additionalUserDetails);


        return new ResponseEntity<>(userInformation, HttpStatus.UNAUTHORIZED);
    }

    @PostMapping("/createUserAccount")
    public ResponseEntity<String> createUserAccount(@RequestBody UserInformation userInformation) {
        try {
            adminCredentailDao.insertUserDetails(userInformation);
            return new ResponseEntity<>("User Details inserted in tables", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @PostMapping("/loginUser")
    public ResponseEntity<String> loginUser(@RequestBody UserCredential userCredential) {
        try {
            adminCredentailDao.insertUserCredentail(userCredential);
            return new ResponseEntity<>("User Credential Details inserted into tables", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/getUserDetails")
    public ResponseEntity<List<Map<String, Object>>> getUserDetails() {
        try {
            List<Map<String, Object>> maps = adminCredentailDao.getUserDetails();
            System.out.println(maps.get(0).get("addressline1"));
            return new ResponseEntity<>(maps, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @PutMapping(value = "/updatePassword/{pass}")
    public String updatePassword(@PathVariable String pass) {
        adminCredential.setPassword(pass);
        return "updated";
    }
}