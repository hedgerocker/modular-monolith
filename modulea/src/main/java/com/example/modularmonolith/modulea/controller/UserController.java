package com.example.modularmonolith.modulea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.comularmonolith.moduleaapi.UserServiceApi;

@RestController
public class UserController {

    final UserServiceApi userServiceApi;

    @Autowired
    public UserController(final UserServiceApi userServiceApi) {
        this.userServiceApi = userServiceApi;
    }

    @GetMapping("/users")
    public String getUserName(){
        return userServiceApi.getUserName();
    }

}
