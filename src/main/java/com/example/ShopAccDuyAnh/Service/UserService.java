package com.example.ShopAccDuyAnh.Service;

import com.example.ShopAccDuyAnh.DTO.Request.UserCreationRequest;
import com.example.ShopAccDuyAnh.Entity.User;
import com.example.ShopAccDuyAnh.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(UserCreationRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setName(request.getName());
        user.setDob(request.getDob());
        return userRepository.save(user);

    }
}
