package com.example.modularmonolith.modulec.service;

import org.springframework.stereotype.Service;

@Service
class AppServiceImpl implements AppServiceApi {

    @Override
    public String getAppName() {
        return "app name";
    }
}
