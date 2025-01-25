package com.restuarant.restuarant.userdetails;

import org.springframework.stereotype.Component;

@Component
public class UserInformation {
    private UserNames userNames;
    private Address address;
    private AdditionalUserDetails additionalUserDetails;

    public UserInformation(UserNames userNames, Address address, AdditionalUserDetails additionalUserDetails) {
        this.userNames = userNames;
        this.address = address;
        this.additionalUserDetails = additionalUserDetails;
    }

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


}
