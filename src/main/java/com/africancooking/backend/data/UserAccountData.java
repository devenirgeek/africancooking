package com.africancooking.backend.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_accounts")
public class UserAccountData {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "username")
    private String userName;
    private String encryptedPassword;
    private String email;

}
