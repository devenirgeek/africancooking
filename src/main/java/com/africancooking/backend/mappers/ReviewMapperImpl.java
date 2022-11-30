package com.africancooking.backend.mappers;

import com.africancooking.backend.data.EstablishmentData;
import com.africancooking.backend.data.PersonData;
import com.africancooking.backend.data.ReviewData;
import com.africancooking.backend.data.UserAccountData;
import com.africancooking.backend.model.requests.CreateReviewRequest;
import com.africancooking.backend.model.responses.CreateReviewResponse;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapperImpl implements ReviewMapper{

    @Override
    public ReviewData mapToReviewData(CreateReviewRequest request) {
        int cuisineRating = request.getRatingCuisine().ordinal() + 1;
        int serviceRating = request.getRatingService().ordinal() + 1;
        int QualityRating = request.getRatingQuality().ordinal() + 1;
        float establishmentRating = (cuisineRating + serviceRating + QualityRating) / 3;

        ReviewData reviewData = new ReviewData();

        UserAccountData userAccountData = new UserAccountData();
        userAccountData.setUserName(request.getUserAccount().getUserName());
        userAccountData.setEmail(request.getUserAccount().getEmail());
        reviewData.setUserAccountData(userAccountData);

        EstablishmentData establishmentData = new EstablishmentData();
        establishmentData.setEstablishmentName(request.getEstablishment().getName());

        PersonData personData = new PersonData();
        personData.setPersonType(request.getEstablishment().getOwner().toString());
        establishmentData.setOwner(personData);

        reviewData.setEstablishment(establishmentData);
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
