package com.example.modularmonolith.moduleb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modularmonolith.modulebapi.service.ComputerServiceApi;

@RestController
public class ComputerController {

    final ComputerServiceApi computerServiceApi;

    @Autowired
    public ComputerController(final ComputerServiceApi computerServiceApi) {
        this.computerServiceApi = computerServiceApi;
    }

    @GetMapping("computers")
    public String getUserComputer(){
        return computerServiceApi.getUserComputer();
    }
}
