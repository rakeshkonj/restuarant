package com.restuarant.restuarant.repository;

import com.restuarant.restuarant.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUserName(String userName);
    UserEntity findByEmailAddress(String emailAddress);
    UserEntity findByMobileNumber(String mobileNumber);
}
