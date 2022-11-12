package com.africancooking.backend.controller;

import com.africancooking.backend.model.requests.UserRegistrationRequest;
import com.africancooking.backend.model.responses.UserRegistrationResponse;
import com.africancooking.backend.service.UserAccountService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserAccountController {

    private final UserAccountService userAccountService;

    @PostMapping(path = "/user/registration")
    public UserRegistrationResponse registerUser(@RequestBody UserRegistrationRequest request){
        log.debug("create user account is called");
        return userAccountService.registerUser(request);
    }
/*

    @GetMapping(path = "/user/login")
    public Status loginUser(@RequestBody AppUser appUser){
        System.out.println("get user account is called");

        return userAccountService.loginUser(request);
    }

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
