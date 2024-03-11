package com.charity.backend.service;

import com.charity.backend.common.dtos.ResponseResult;
import com.charity.backend.model.dtos.LoginDto;

public interface UserService {
    public ResponseResult login(LoginDto dto);
}
