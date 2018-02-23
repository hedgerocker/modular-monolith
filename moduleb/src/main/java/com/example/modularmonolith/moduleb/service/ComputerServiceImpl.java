package com.example.modularmonolith.moduleb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.modularmonolith.modulebapi.service.ComputerServiceApi;
import com.example.modularmonolith.modulec.service.AppServiceApi;

@Service
class ComputerServiceImpl implements ComputerServiceApi {

    private final AppServiceApi appServiceApi;

    @Autowired
    public ComputerServiceImpl(final AppServiceApi appServiceApi) {
        this.appServiceApi = appServiceApi;
    }

    @Override
    public String getUserComputer() {
        return "Sth";
    }
}
