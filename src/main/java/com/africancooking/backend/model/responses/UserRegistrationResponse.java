package com.africancooking.backend.model.responses;

import com.africancooking.backend.model.Status;
import lombok.Data;

@Data
public class UserRegistrationResponse {
    private String username;
    private String email;
    private Long id;
}
