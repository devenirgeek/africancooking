package com.africancooking.backend.model;

import com.africancooking.backend.data.UserAccount;
import lombok.Data;

@Data
public class Review {
    private Establishment establishment;
    private UserAccount userAccount;
    private ReviewItems reviewItems;
}
