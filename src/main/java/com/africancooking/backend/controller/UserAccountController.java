package com.africancooking.backend.controller;

import com.africancooking.backend.model.AppUser;
import com.africancooking.backend.model.Status;
import com.africancooking.backend.model.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class UserAccountController {

    private UserRepository userRepository;

    @PostMapping(path = "/user/registration")
    public Status registerUser(@RequestBody AppUser newAppUser){
        log.debug("create user account is called");

        return Status.FAILED;
    }

    @GetMapping(path = "/user/login")
    public Status loginUser(@RequestBody AppUser appUser){
        System.out.println("get user account is called");

        return Status.FAILED;
    }

    @GetMapping(path = "/user/logout")
    public Status logUserOut(@RequestBody AppUser appUser){
        System.out.println("get user account is called");

        return Status.FAILED;
    }

    @GetMapping(path = "/user/login")
    public Status deleteUser(@RequestBody AppUser appUser){
        System.out.println("get user account is called");

        return Status.FAILED;
    }

}
