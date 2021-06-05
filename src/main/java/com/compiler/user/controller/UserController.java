package com.compiler.user.controller;

import com.compiler.user.model.User;
import com.compiler.user.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping
    public ResponseEntity<HttpStatus> createUser(@Valid @RequestBody final User user) {
        boolean userCreateStatus = userService.createUser(user);
        if (userCreateStatus) {
            return ResponseEntity.ok(HttpStatus.CREATED);
        } else {
            return ResponseEntity.ok(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
        List<User> users = userService.getAllUser();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {
        User user = userService.getUser(username);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/user/{username}")
    public ResponseEntity<HttpStatus> updateUser(@PathVariable String username) {
        boolean updateUserStatus = userService.updateUser(username);
        if (updateUserStatus) {
            return ResponseEntity.ok(HttpStatus.CREATED);
        } else {
            return ResponseEntity.ok(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/user/delete/{username}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable String username) {
        boolean deleteUserStatus = userService.deleteUser(username);
        if (deleteUserStatus) {
            return ResponseEntity.ok(HttpStatus.CREATED);
        } else {
            return ResponseEntity.ok(HttpStatus.BAD_REQUEST);
        }
    }
}
