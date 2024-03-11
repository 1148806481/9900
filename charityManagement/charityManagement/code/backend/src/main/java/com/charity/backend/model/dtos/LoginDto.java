package com.charity.backend.model.dtos;


import lombok.Data;

@Data
public class LoginDto {
    private String username;

    private String password;
}
