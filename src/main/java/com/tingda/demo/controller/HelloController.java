package com.tingda.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/hello")
    public String hello(){
        logger.info("sssssssss");
        return "Hello Word";
    }
}
