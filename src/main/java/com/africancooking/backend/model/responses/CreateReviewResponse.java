package com.africancooking.backend.model.responses;

import com.africancooking.backend.model.Status;
import lombok.Data;

@Data
public class CreateReviewResponse {
    private Status CreateReviewStatus = Status.SUCCESS;
    private float establishmentRating;
    //private float scalar = 5; //The total number of star
}
