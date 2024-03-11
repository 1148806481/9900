package com.charity.backend.service.impl;

import com.charity.backend.common.dtos.ResponseResult;
import com.charity.backend.model.dtos.LoginDto;
import com.charity.backend.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public ResponseResult login(LoginDto dto) {
        return ResponseResult.error(500, "not implemented");
    }
}
