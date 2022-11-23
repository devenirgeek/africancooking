package com.africancooking.backend.mappers;

import com.africancooking.backend.data.ReviewData;
import com.africancooking.backend.model.requests.CreateReviewRequest;
import com.africancooking.backend.model.responses.CreateReviewResponse;

public interface ReviewMapper {

    ReviewData mapToReviewData(CreateReviewRequest request);

    public CreateReviewResponse mapToReviewResponse(ReviewData savedReview);
}
