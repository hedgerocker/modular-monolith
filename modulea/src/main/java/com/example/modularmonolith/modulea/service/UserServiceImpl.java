package com.example.modularmonolith.modulea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.comularmonolith.moduleaapi.UserServiceApi;
import com.example.modularmonolith.modulebapi.service.ComputerServiceApi;

@Service
class UserServiceImpl implements UserServiceApi {

    private final ComputerServiceApi computerServiceApi;

    @Autowired
    public UserServiceImpl(ComputerServiceApi computerServiceApi) {
        this.computerServiceApi = computerServiceApi;
    }

    @Override
    public String getUserName() {
        return computerServiceApi.getUserComputer();
    }


}
