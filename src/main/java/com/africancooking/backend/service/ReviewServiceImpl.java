package com.africancooking.backend.service;

import com.africancooking.backend.data.ReviewData;
import com.africancooking.backend.mappers.ReviewMapper;
import com.africancooking.backend.model.requests.CreateReviewRequest;
import com.africancooking.backend.model.responses.CreateReviewResponse;
import com.africancooking.backend.repositories.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService{

    private final ReviewRepository reviewRepository;
    private final ReviewMapper reviewMapper;
    @Override
    public CreateReviewResponse createReview(CreateReviewRequest request) {
        ReviewData reviewData = reviewMapper.mapToReviewData(request);
        ReviewData savedReview = reviewRepository.save(reviewData);
        CreateReviewResponse reviewResponse = reviewMapper.mapToReviewResponse(savedReview);
        return reviewResponse;
    }
}
