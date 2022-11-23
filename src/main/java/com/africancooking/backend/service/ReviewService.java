package com.africancooking.backend.service;

import com.africancooking.backend.model.requests.CreateReviewRequest;
import com.africancooking.backend.model.responses.CreateReviewResponse;

public interface ReviewService {
    CreateReviewResponse createReview(CreateReviewRequest request);
}
