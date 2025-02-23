package com.restuarant.restuarant.userdetails;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserInformation {
    @Id
    private Long userID;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Embedded
    private UserNames userNames;
    @Column(name = "DOB")
    private String dateOfBirth;
    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    @Column(unique = true)
    private String emailID;
    @Embedded
    private Address address;
    @Embedded
    private AdditionalUserDetails additionalUserDetails;


    public UserNames getUserNames() {
        return userNames;
    }

    public void setUserNames(UserNames userNames) {
        this.userNames = userNames;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AdditionalUserDetails getAdditionalUserDetails() {
        return additionalUserDetails;
    }

    public void setAdditionalUserDetails(AdditionalUserDetails additionalUserDetails) {
        this.additionalUserDetails = additionalUserDetails;
    }
    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "UserInformation{" +
                "userID=" + userID +
                ", userNames=" + userNames +
                ", emailID='" + emailID + '\'' +
                ", address=" + address +
                ", additionalUserDetails=" + additionalUserDetails +
                '}';
    }
}
