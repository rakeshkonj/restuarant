package com.restuarant.restuarant.controller;

import com.restuarant.restuarant.HibernateConfig;
import com.restuarant.restuarant.service.AutomatedUserIdCreation;
import com.restuarant.restuarant.userdetails.UserInformation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
@Autowired
    AutomatedUserIdCreation automatedUserIdCreation;
    @PostMapping(value = "/addingNewUserInformation", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addingNewUserInformation(@RequestBody UserInformation userInformation) {
        try {
            HibernateConfig<UserInformation> hibernateConfig = new HibernateConfig<>();
            hibernateConfig.hibernateAdding(userInformation);
        } catch (Exception e) {
            return new ResponseEntity<>(" User already exist and email exists ", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(" User Information Updated Succesfully ", HttpStatus.ACCEPTED);
    }

    @GetMapping("/getUserRecordById/{id}")
    public ResponseEntity<UserInformation> getUserRecordById(@PathVariable int id) throws Exception {
        System.out.println("--------------HELLOOOOO");
        UserInformation userInformation = null;
        try {
            HibernateConfig<UserInformation> hibernateConfig = new HibernateConfig<>();
            userInformation = hibernateConfig.hibernateUserDataFetchById(id);
            String s=automatedUserIdCreation.userIDCreation(userInformation);
        } catch (Exception e) {
            return new ResponseEntity<UserInformation>(userInformation, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<UserInformation>(userInformation,  HttpStatus.ACCEPTED);

    }


}
