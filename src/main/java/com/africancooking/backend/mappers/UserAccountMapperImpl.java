package com.africancooking.backend.mappers;

import com.africancooking.backend.data.UserAccountData;
import com.africancooking.backend.model.requests.UserRegistrationRequest;
import com.africancooking.backend.model.responses.UserLoginResponse;
import com.africancooking.backend.model.responses.UserRegistrationResponse;
import com.africancooking.backend.security.PasswordEncoder;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserAccountMapperImpl implements UserAccountMapper {

    private final PasswordEncoder passwordEncoder;

    @Override
    public UserAccountData mapToData(UserRegistrationRequest request) {
        UserAccountData userAccountData = new UserAccountData();
        userAccountData.setEmail(request.getEmail());
        String encode = passwordEncoder.encode(request.getPassword());
        userAccountData.setEncryptedPassword(encode);
        userAccountData.setUserName(request.getUsername());
        return userAccountData;
    }

    @Override
    public UserRegistrationResponse mapToRegistrationResponse(UserAccountData savedUserAccountData) {

        UserRegistrationResponse userRegistrationResponse = new UserRegistrationResponse();
        userRegistrationResponse.setUsername(savedUserAccountData.getUserName());

        return userRegistrationResponse;
    }

    @Override
    public UserLoginResponse toLoginResponse(UserAccountData foundUserAccountData) {
        UserLoginResponse response = new UserLoginResponse();
        response.setEmail(foundUserAccountData.getEmail());
        response.setId(foundUserAccountData.getId());
        return response;
    }
}
