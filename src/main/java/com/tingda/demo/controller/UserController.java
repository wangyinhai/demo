package com.tingda.demo.controller;


import com.tingda.demo.entity.User;
import com.tingda.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    @ResponseBody
    public List<User> hello(){
        logger.info("sssssssss");
        return userService.selectAll();
    }
}
