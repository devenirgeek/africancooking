package com.africancooking.backend.service;

import com.africancooking.backend.model.AppUser;

public class AppUserService {

    private AppUser appUser;

    public AppUserService(AppUser appUser) {
        this.appUser = appUser;
    }

    public boolean createAppUserAccount(AppUser appUser){
        System.out.println("The user has been successfully created");

        return false;
    }
}
