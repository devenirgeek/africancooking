package com.africancooking.backend.model.responses;

import com.africancooking.backend.model.Status;
import lombok.Data;

@Data
public class UserRegistrationResponse {
    private Status registrationStatus = Status.SUCCESS;
    private Status username;
}
