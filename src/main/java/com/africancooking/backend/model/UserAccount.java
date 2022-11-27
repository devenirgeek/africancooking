package com.africancooking.backend.model;


import lombok.Data;

@Data
public class UserAccount {
    private String userName;
    private String encryptedPassword;
    private String email;
}
