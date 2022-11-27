package com.africancooking.backend.repositories;

import com.africancooking.backend.data.UserAccountData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends CrudRepository<UserAccountData, Long> {
    UserAccountData findByUserNameAndEncryptedPassword(String username, String password);
}
