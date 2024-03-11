package com.charity.backend.controller;

import com.charity.backend.common.dtos.ResponseResult;
import com.charity.backend.model.dtos.LoginDto;
import com.charity.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class Login {

    @Autowired
    private UserService userService;

    @PostMapping("signin")
    public ResponseResult login(@RequestBody LoginDto dto) {
        return userService.login(dto);
    }
}
