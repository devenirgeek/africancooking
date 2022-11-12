package com.africancooking.backend.mappers;

import com.africancooking.backend.data.UserAccount;
import com.africancooking.backend.model.requests.UserRegistrationRequest;
import com.africancooking.backend.model.responses.UserRegistrationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

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
    public UserRegistrationResponse mapToResponse(UserAccount savedUserAccount) {
        return null;
    }
}
