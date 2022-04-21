package com.example.unittestinghomework.controller;

import com.example.unittestinghomework.model.User;
import com.example.unittestinghomework.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() { return userService.getAllUsers(); }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Integer id) { return userService.getUserById(id); }

    @DeleteMapping("/users/delete/{id}")
    public void deleteUser(@PathVariable Integer id) { userService.deleteUserById(id); }

}
