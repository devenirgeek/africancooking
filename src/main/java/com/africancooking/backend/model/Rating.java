package com.africancooking.backend.model;

import com.africancooking.backend.data.UserAccount;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


/**
 * Here are the conditions to be respected when a user wants to rate an establishment:
 *      1. He must have a user account (he/she must log in to his/her profile). If he/she doesn't have an account yet,
 *      the application will propose him/her to open an account
 *      2. Not to be the owner or not to have an establishment linked to his user profile.
 */
@Getter
@Setter
public class Rating {

    //private AppUser webUser;
    private UserAccount userAccount;
    private Establishment establishment;

    private ReviewItems reviewItems;
    private ReviewItems ratingCuisine; // EXCELLENT, GOOD, ACCEPTABLE, BAD or VERY_BAD
    private ReviewItems ratingService; // EXCELLENT, GOOD, ACCEPTABLE, BAD or VERY_BAD
    private ReviewItems ratingQuality; // EXCELLENT, GOOD, ACCEPTABLE, BAD or VERY_BAD

    private float scalar; //The total number of users who have rated a particular restaurant
    private float value;

    public Rating(UserAccount userAccount, Establishment establishment, ReviewItems ratingCuisine, ReviewItems ratingService, ReviewItems ratingQuality) {
        this.userAccount = userAccount;
        this.establishment = establishment;
        this.ratingCuisine = ratingCuisine;
        this.ratingService = ratingService;
        this.ratingQuality = ratingQuality;
    }
}
