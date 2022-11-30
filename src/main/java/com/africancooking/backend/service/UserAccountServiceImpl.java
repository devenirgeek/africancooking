package com.africancooking.backend.service;

import com.africancooking.backend.data.UserAccountData;
import com.africancooking.backend.mappers.UserAccountMapper;
import com.africancooking.backend.model.requests.UserLoginRequest;
import com.africancooking.backend.model.requests.UserRegistrationRequest;
import com.africancooking.backend.model.responses.UserLoginResponse;
import com.africancooking.backend.model.responses.UserRegistrationResponse;
import com.africancooking.backend.repositories.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserAccountServiceImpl implements UserAccountService{

    private final UserAccountRepository userAccountRepository;
    private final UserAccountMapper userAccountMapper;

    @Override
    public UserRegistrationResponse registerUser(UserRegistrationRequest request) {
        UserAccountData userAccountData = userAccountMapper.mapToData(request);
        UserAccountData savedUserAccountData = userAccountRepository.save(userAccountData);
        UserRegistrationResponse response = userAccountMapper.mapToRegistrationResponse(savedUserAccountData);
        return response;
    }

    @Override
    public UserLoginResponse loginUser(UserLoginRequest request) {
        UserAccountData foundUserAccountData = userAccountRepository.findByUserNameAndEncryptedPassword(request.getUsername(), request.getPassword());
        if (foundUserAccountData == null){
             throw new IllegalArgumentException("Invalid credential provided");
        }

        UserLoginResponse response = userAccountMapper.mapToLoginResponse(foundUserAccountData);
        return response;
    }
}
