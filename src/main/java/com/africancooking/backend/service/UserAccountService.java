package com.africancooking.backend.service;

import com.africancooking.backend.model.requests.UserLoginRequest;
import com.africancooking.backend.model.requests.UserRegistrationRequest;
import com.africancooking.backend.model.responses.UserLoginResponse;
import com.africancooking.backend.model.responses.UserRegistrationResponse;

public interface UserAccountService {

    UserRegistrationResponse registerUser(UserRegistrationRequest request);

    UserLoginResponse loginUser(UserLoginRequest request);
}
