package com.restuarant.restuarant.userdetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserCredential {

    private String password;
    @Id
    private String userID;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}




