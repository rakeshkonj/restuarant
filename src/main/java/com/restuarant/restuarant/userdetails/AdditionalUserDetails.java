package com.restuarant.restuarant.userdetails;

import jakarta.persistence.Embeddable;



@Embeddable
public class AdditionalUserDetails {

    public String getRefferalCode() {
        return refferalCode;
    }

    public void setRefferalCode(String refferalCode) {
        this.refferalCode = refferalCode;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    private String refferalCode;

    private String promoCode;

    @Override
    public String toString() {
        return "AdditionalUserDetails{" +
                "refferalCode='" + refferalCode + '\'' +
                ", promoCode='" + promoCode + '\'' +
                '}';
    }
}