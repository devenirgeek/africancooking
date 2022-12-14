package com.africancooking.backend.model.requests;

import com.africancooking.backend.data.EstablishmentData;
import com.africancooking.backend.data.UserAccountData;
import com.africancooking.backend.model.Establishment;
import com.africancooking.backend.model.ReviewItems;
import com.africancooking.backend.model.UserAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateReviewRequest {
    private UserAccount userAccount;
    private Establishment establishment;
    private ReviewItems ratingCuisine; // EXCELLENT, GOOD, ACCEPTABLE, BAD or VERY_BAD
    private ReviewItems ratingService; // EXCELLENT, GOOD, ACCEPTABLE, BAD or VERY_BAD
    private ReviewItems ratingQuality; // EXCELLENT, GOOD, ACCEPTABLE, BAD or VERY_BAD
}
