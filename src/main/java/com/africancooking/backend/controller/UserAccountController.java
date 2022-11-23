package com.africancooking.backend.controller;

import com.africancooking.backend.model.requests.CreateEstablishmentRequest;
import com.africancooking.backend.model.requests.UserLoginRequest;
import com.africancooking.backend.model.requests.UserRegistrationRequest;
import com.africancooking.backend.model.responses.CreateEstablishmentResponse;
import com.africancooking.backend.model.responses.UserLoginResponse;
import com.africancooking.backend.model.responses.UserRegistrationResponse;
import com.africancooking.backend.service.EstablishmentService;
import com.africancooking.backend.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserAccountController {

    private final UserAccountService userAccountService;
    private final EstablishmentService establishmentService;

    @PostMapping(path = "/user/registration")
    public UserRegistrationResponse registerUser(@RequestBody UserRegistrationRequest request){
        System.out.println("create user account is called");
        return userAccountService.registerUser(request);
    }


    @GetMapping(path = "/user/login")
    public UserLoginResponse loginUser(@RequestBody UserLoginRequest request){
        System.out.println("get user account is called");
        return userAccountService.loginUser(request);
    }

    @PostMapping(path = "/establishment/create")
    public CreateEstablishmentResponse createEstablishment(@RequestBody CreateEstablishmentRequest request){
        return establishmentService.createEstablishment(request);
    }


/*
    @GetMapping(path = "/user/logout")
    public Status logUserOut(@RequestBody AppUser appUser){
        System.out.println("get user account is called");

        return Status.FAILED;
    }

    @DeleteMapping(path = "/user/delete")
    public Status deleteUser(@RequestBody AppUser appUser){
        System.out.println("get user account is called");

        return Status.FAILED;
    }
*/

}
