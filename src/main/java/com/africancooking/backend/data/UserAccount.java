package com.africancooking.backend.data;


import com.africancooking.backend.model.responses.UserRegistrationResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_accounts")
public class UserAccount {

    @Id
    //auto generate spring jpa id
    private Long id;
    @Column(name = "username")
    private String userName;
    private String encryptedPassword;
    private String email;

}
