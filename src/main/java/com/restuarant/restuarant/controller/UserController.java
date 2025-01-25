package com.restuarant.restuarant.controller;

import com.restuarant.restuarant.dtos.AdminCredentailDao;
import com.restuarant.restuarant.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

  /*  private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<AdminCredentailDao> createUser(@RequestBody AdminCredentailDao userDTO) {
        AdminCredentailDao user = userService.registerUser(userDTO);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<AdminCredentailDao> loginUser(@RequestBody AdminCredentailDao userDTO) {
        return new ResponseEntity<>(userService.loginUser(userDTO.userName(), userDTO.password()), HttpStatus.OK);
    }
*/
  /*  @GetMapping("/{id}")
    public ResponseEntity<AdminCredentailDao> getUser(@PathVariable Long id) {
      //TBD
        return null;
    }


    @GetMapping("/all")
    public ResponseEntity<AdminCredentailDao> getAllUsers() {
        // TBD
        return null;
    }*/

}
