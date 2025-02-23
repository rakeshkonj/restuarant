package com.restuarant.restuarant.service;

import com.restuarant.restuarant.HibernateConfig;
import com.restuarant.restuarant.userdetails.UserCredential;
import com.restuarant.restuarant.userdetails.UserInformation;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
public class AutomatedUserIdCreation<T> {
   // T obj;
    public String userIDCreation(T obj){
      //  this.obj=obj;
UserInformation userInformation= (UserInformation) obj;
 String password= userInformation.getUserNames().getFirstName()+"@"+userInformation.getUserID()+"@"+(userInformation.getDateOfBirth()).split("-")[2];
        UserCredential userCredential=new UserCredential();
        userCredential.setUserID(userInformation.getEmailID());
        userCredential.setPassword(password);
        HibernateConfig<UserCredential> hibernateConfig = new HibernateConfig<>();
        hibernateConfig.hibernateAdding(userCredential);
        return null;
    }
}
