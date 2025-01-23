package com.restuarant.restuarant.controller;

import com.restuarant.restuarant.dtos.UserDTO;
import com.restuarant.restuarant.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        UserDTO user = userService.registerUser(userDTO);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<UserDTO> loginUser(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(userService.loginUser(userDTO.userName(), userDTO.password()), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Long id) {
      //TBD
        return null;
    }


    @GetMapping("/all")
    public ResponseEntity<UserDTO> getAllUsers() {
        // TBD
        return null;
    }

}
