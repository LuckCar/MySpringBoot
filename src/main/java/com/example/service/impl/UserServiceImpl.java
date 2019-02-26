package com.example.service.impl;

import com.example.dao.UserMapper;
import com.example.model.MyResult;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public MyResult login(User user) {
        User u = new User();
        List<User> list = new ArrayList<>();
        list = userMapper.loin(user);
        MyResult result = new MyResult();
        if (list.size()!=0){
            result.setCode(200);
            result.setMsg("登录成功！");
            result.setList(list);
            result.setObj(list.get(0));
        }else {
            result.setCode(201);
            result.setMsg("登录失败！");
        }
        return result;
    }
}
