package com.africancooking.backend.model.requests;

import lombok.Data;

@Data
public class UserLoginRequest {
    private String username;
    private String password;
}
