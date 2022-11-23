package com.africancooking.backend.repositories;

import com.africancooking.backend.data.UserAccount;
import com.africancooking.backend.model.Establishment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {
    UserAccount findByUserNameAndEncryptedPassword(String username, String password);
}
