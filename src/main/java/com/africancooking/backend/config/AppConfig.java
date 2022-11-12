package com.africancooking.backend.config;

import com.africancooking.backend.mappers.UserAccountMapper;
import com.africancooking.backend.mappers.UserAccountMapperImpl;
import com.africancooking.backend.security.BCryptPasswordEncoder;
import com.africancooking.backend.security.PasswordEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Bean
    public UserAccountMapper userAccountMapper(PasswordEncoder encoder) {
        return new UserAccountMapperImpl(encoder);
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}
