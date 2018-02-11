package com.example.modularmonolith.modulea.controller;

import com.example.comularmonolith.moduleaapi.UserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserServiceApi userServiceApi;

    @GetMapping("/users")
    public String getUserName(){
        return userServiceApi.getUserName();
    }

}
