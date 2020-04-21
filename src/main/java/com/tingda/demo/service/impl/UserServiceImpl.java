package com.tingda.demo.service.impl;

import com.tingda.demo.dao.UserMapper;
import com.tingda.demo.entity.User;
import com.tingda.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
