package com.DilumBMK.ToolManagementSystem.service;

import com.DilumBMK.ToolManagementSystem.model.Users;
import com.DilumBMK.ToolManagementSystem.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;


    public Users saveUser(Users users)
    {
        return userRepo.save(users);

    }


}
