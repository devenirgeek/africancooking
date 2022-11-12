package com.africancooking.backend.mappers;

import com.africancooking.backend.data.UserAccount;
import com.africancooking.backend.model.requests.UserRegistrationRequest;
import com.africancooking.backend.model.responses.UserLoginResponse;
import com.africancooking.backend.model.responses.UserRegistrationResponse;

public interface UserAccountMapper {
    UserAccount mapToData(UserRegistrationRequest request);

    UserRegistrationResponse mapToRegistrationResponse(UserAccount savedUserAccount);

    UserLoginResponse toLoginResponse(UserAccount foundUserAccount);
}
