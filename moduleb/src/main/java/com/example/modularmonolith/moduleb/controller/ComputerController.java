package com.example.modularmonolith.moduleb.controller;

import com.example.modularmonolith.modulebapi.service.ComputerServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputerController {

    @Autowired
    ComputerServiceApi computerServiceApi;

    @GetMapping("computers")
    public String getUserComputer(){
        return computerServiceApi.getUserComputer();
    }
}
