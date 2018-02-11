package com.example.modularmonolith.moduleb.service;

import com.example.comularmonolith.moduleaapi.UserServiceApi;
import com.example.modularmonolith.modulebapi.service.ComputerServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class ComputerServiceImpl implements ComputerServiceApi {

    private final UserServiceApi userServiceApi;

    @Autowired
    public ComputerServiceImpl(UserServiceApi userServiceApi) {
        this.userServiceApi = userServiceApi;
    }

    @Override
    public String getUserComputer() {
        return "Marcins Computer";
    }
}
