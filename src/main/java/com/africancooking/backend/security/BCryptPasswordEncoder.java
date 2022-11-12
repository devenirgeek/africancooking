package com.africancooking.backend.security;


public class BCryptPasswordEncoder implements PasswordEncoder {


    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return true;
    }

    @Override
    public boolean upgradeEncoding(String encodedPassword) {
        return true;
    }


}
