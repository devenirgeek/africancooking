package com.africancooking.backend.mappers;

import com.africancooking.backend.data.ReviewData;
import com.africancooking.backend.model.requests.CreateReviewRequest;
import com.africancooking.backend.model.responses.CreateReviewResponse;

public class ReviewMapperImpl implements ReviewMapper{

    @Override
    public ReviewData mapToReviewData(CreateReviewRequest request) {
        int cuisineRating = request.getRatingCuisine().ordinal() + 1;
        int serviceRating = request.getRatingService().ordinal() + 1;
        int QualityRating = request.getRatingQuality().ordinal() + 1;
        float establishmentRating = (cuisineRating + serviceRating + QualityRating) / 3;

        ReviewData reviewData = new ReviewData();
        reviewData.setUserAccount(request.getUserAccount());
        reviewData.setEstablishment(request.getEstablishment());
        reviewData.setRatingCuisine(request.getRatingCuisine());
        reviewData.setRatingService(request.getRatingService());
        reviewData.setRatingQuality(request.getRatingQuality());
        reviewData.setEstablishmentRating(establishmentRating);

        return reviewData;
    }

    @Override
    public CreateReviewResponse mapToReviewResponse(ReviewData savedReview) {
        CreateReviewResponse createReviewResponse = new CreateReviewResponse();
        createReviewResponse.setEstablishmentRating(savedReview.getEstablishmentRating());
        return createReviewResponse;
    }


}
