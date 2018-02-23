package com.example.modularmonolith.modulec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.modularmonolith.modulec.service.UserIntegrationService;

@RestController
public class AppController {

    final UserIntegrationService userIntegrationService;

    @Autowired
    public AppController(final UserIntegrationService userIntegrationService) {
        this.userIntegrationService = userIntegrationService;
    }

    @GetMapping("apps")
    public String getApps(){
        return userIntegrationService.getAppName();
    }
}
