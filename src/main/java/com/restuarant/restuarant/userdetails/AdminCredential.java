package com.restuarant.restuarant.userdetails;
import org.springframework.stereotype.Component;

@Component
public class AdminCredential {
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String userID;
    private String password;
}
