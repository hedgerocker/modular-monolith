package com.example.modularmonolith.modulea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.modularmonolith.modulebapi.service.ComputerServiceApi;
import com.example.modularmonolith.modulec.service.UserIntegrationService;

@Service
class UserIntegrationServiceImpl implements UserIntegrationService {

    private final ComputerServiceApi computerServiceApi;

    @Autowired
    public UserIntegrationServiceImpl(ComputerServiceApi computerServiceApi) {
        this.computerServiceApi = computerServiceApi;
    }

    @Override
    public String getAppName() {
        return "Dog";
    }
}
