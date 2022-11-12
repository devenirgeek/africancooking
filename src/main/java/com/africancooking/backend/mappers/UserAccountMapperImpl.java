package com.africancooking.backend.mappers;

import com.africancooking.backend.data.UserAccount;
import com.africancooking.backend.model.requests.UserRegistrationRequest;
import com.africancooking.backend.model.responses.UserLoginResponse;
import com.africancooking.backend.model.responses.UserRegistrationResponse;
import com.africancooking.backend.security.PasswordEncoder;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserAccountMapperImpl implements UserAccountMapper {

    private final PasswordEncoder passwordEncoder;

    @Override
    public UserAccount mapToData(UserRegistrationRequest request) {
        UserAccount userAccount = new UserAccount();
        userAccount.setEmail(request.getEmail());
        String encode = passwordEncoder.encode(request.getPassword());
        userAccount.setEncryptedPassword(encode);
        userAccount.setUserName(request.getUsername());
        return userAccount;
    }

    @Override
    public UserRegistrationResponse mapToRegistrationResponse(UserAccount savedUserAccount) {

        UserRegistrationResponse userRegistrationResponse = new UserRegistrationResponse();
        userRegistrationResponse.setUsername(savedUserAccount.getUserName());

        return userRegistrationResponse;
    }

    @Override
    public UserLoginResponse toLoginResponse(UserAccount foundUserAccount) {
        UserLoginResponse response = new UserLoginResponse();
        response.setEmail(foundUserAccount.getEmail());
        response.setId(foundUserAccount.getId());
        return response;
    }
}
