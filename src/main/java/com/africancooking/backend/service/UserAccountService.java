package com.africancooking.backend.service;

import com.africancooking.backend.controller.UserAccountController;

public interface UserAccountService {
    boolean createUserAccount(UserAccountController.CreateUserAccount createUserAccount);
}
