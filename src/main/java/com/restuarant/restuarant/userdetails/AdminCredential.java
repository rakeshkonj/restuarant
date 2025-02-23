package com.restuarant.restuarant.userdetails;


import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class AdminCredential {
    public String getUserID() {
        return userID;
    }

    @Override
    public String toString() {
        return "AdminCredential{" +
                "userID='" + userID + '\'' +
                ", password='" + password + '\'' +
                '}';
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
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")    private String userID;
    private String password;
}
