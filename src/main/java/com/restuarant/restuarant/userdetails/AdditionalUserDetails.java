package com.restuarant.restuarant.userdetails;

import org.springframework.stereotype.Component;

@Component
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

}