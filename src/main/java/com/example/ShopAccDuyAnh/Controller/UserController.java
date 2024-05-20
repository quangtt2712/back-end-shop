package com.example.ShopAccDuyAnh.Controller;

import com.example.ShopAccDuyAnh.DTO.Request.UserCreationRequest;
import com.example.ShopAccDuyAnh.Entity.User;
import com.example.ShopAccDuyAnh.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User creaUser(@RequestBody UserCreationRequest userCreationRequest) {
        return userService.createUser(userCreationRequest);
    }
}
