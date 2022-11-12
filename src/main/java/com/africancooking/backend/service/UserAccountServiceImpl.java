package com.africancooking.backend.service;

import com.africancooking.backend.data.UserAccount;
import com.africancooking.backend.mappers.UserAccountMapper;
import com.africancooking.backend.model.requests.UserRegistrationRequest;
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
        UserAccount userAccount = userAccountMapper.mapToData(request);
        UserAccount savedUserAccount = userAccountRepository.save(userAccount);
        UserRegistrationResponse response = userAccountMapper.mapToResponse(savedUserAccount);
        return response;
    }
}
