package com.africancooking.backend.mappers;

import com.africancooking.backend.data.UserAccountData;
import com.africancooking.backend.model.requests.UserRegistrationRequest;
import com.africancooking.backend.model.responses.UserLoginResponse;
import com.africancooking.backend.model.responses.UserRegistrationResponse;

public interface UserAccountMapper {
    UserAccountData mapToData(UserRegistrationRequest request);

    UserRegistrationResponse mapToRegistrationResponse(UserAccountData savedUserAccountData);

    UserLoginResponse mapToLoginResponse(UserAccountData foundUserAccountData);
}
