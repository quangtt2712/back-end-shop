package com.example.ShopAccDuyAnh.DTO.Request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserCreationRequest {
    private String username;
    private String password;
    private String name;
    private LocalDate dob;
}
