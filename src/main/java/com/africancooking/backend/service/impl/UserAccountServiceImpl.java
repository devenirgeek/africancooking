package com.africancooking.backend.service.impl;

import com.africancooking.backend.controller.UserAccountController;
import com.africancooking.backend.service.UserAccountService;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    //private final UserAccountRepository userAccountRepository;

    @Override
    public boolean createUserAccount(UserAccountController.CreateUserAccount createUserAccount) {
        return false;
    }
}
