package com.project.demo.controller;

import com.project.demo.pojo.User;
import com.project.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yiwo
 * @name 王习诚
 * @time 2020/11/17 16:32
 */
@RestController
@RequestMapping("/user")
public class UserController {
//
//    @Autowired private UserService service;
//
//    @RequestMapping("/register")
//    public String register(User user){
//        return service.register(user).toString();
//    }
//
//    @RequestMapping("/findUser/{id}")
//    public String findUser(@PathVariable int id){
//        return service.findById(id).toString();
//    }
}
