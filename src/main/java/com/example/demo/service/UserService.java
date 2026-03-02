package com.example.demo.service;

import java.util.List;

import com.example.demo.model.dto.UserAddRequest;
import com.example.demo.model.dto.UserDto;

public interface UserService {
    UserDto AddUser (UserAddRequest request);
    List<UserDto> getAllUser();
    UserDto getUserById(String id);
    UserDto updateUser(String id, UserAddRequest request);
    void DeleteUser(String id);
}

