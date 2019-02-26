package com.example.service;

import com.example.model.MyResult;
import com.example.model.User;

public interface UserService {
    MyResult login(User user);
}
