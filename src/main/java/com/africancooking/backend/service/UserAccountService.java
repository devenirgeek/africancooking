package com.africancooking.backend.service;

import com.africancooking.backend.model.requests.UserRegistrationRequest;
import com.africancooking.backend.model.responses.UserRegistrationResponse;

public interface UserAccountService {

    UserRegistrationResponse registerUser(UserRegistrationRequest request);
}
