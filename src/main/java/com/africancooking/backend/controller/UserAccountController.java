package com.africancooking.backend.controller;

import com.africancooking.backend.model.Profile;
import com.africancooking.backend.service.UserAccountService;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController("/account")
public class UserAccountController {

    private final UserAccountService userAccountService;

    @PostMapping(path = "/create")
    public ResponseEntity<Void> createUserAccount(@RequestBody CreateUserAccount createUserAccount){
        System.out.println("create user account is called");
        boolean result = userAccountService.createUserAccount(createUserAccount);
        if(result)
            return ResponseEntity.status(201).build();
        return ResponseEntity.status(404).build();
    }

    @GetMapping(path = "/login")
    public ResponseEntity<Profile> loginUser(@PathVariable String userName, @PathVariable String password){
        System.out.println(userName);
        System.out.println(password);
        return ResponseEntity.status(200).build();
    }

    @Data
    @NoArgsConstructor
    public static class CreateUserAccount {
        String userName;
        String password;
    }
}
