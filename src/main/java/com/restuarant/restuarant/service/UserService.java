package com.restuarant.restuarant.service;

import com.restuarant.restuarant.dtos.UserDTO;
import com.restuarant.restuarant.entities.UserEntity;
import com.restuarant.restuarant.mapper.UserMapper;
import com.restuarant.restuarant.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private  final UserRepository userRepository;

    private final UserMapper mapper;

    private final PasswordEncoder passwordEncoder;

    public UserDTO registerUser(UserDTO userDTO){
       UserDTO updatedUserDTO = new UserDTO(
               userDTO.id(),
               userDTO.userName(),
               userDTO.mobileNumber(),
               userDTO.emailAddress(),
               passwordEncoder.encode(userDTO.password()));
        return mapper.userEntity2DTO(userRepository.save(mapper.userDTO2Entity(updatedUserDTO)));
    }

    public UserDTO loginUser(String username, String password){
        UserEntity user = userRepository.findByUserName(username);
        if(user!=null && passwordEncoder.matches(password, user.getPassword())){
            return mapper.userEntity2DTO(user);
        }
        return null;
    }
}
