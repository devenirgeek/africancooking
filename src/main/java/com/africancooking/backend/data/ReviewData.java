package com.africancooking.backend.data;

import com.africancooking.backend.model.Establishment;
import com.africancooking.backend.model.ReviewItems;
import lombok.*;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "review_data")
public class ReviewData {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private UserAccountData userAccountData;

    @OneToOne
    private EstablishmentData establishment;

    private ReviewItems ratingCuisine; // EXCELLENT, GOOD, ACCEPTABLE, BAD or VERY_BAD
    private ReviewItems ratingService; // EXCELLENT, GOOD, ACCEPTABLE, BAD or VERY_BAD
    private ReviewItems ratingQuality; // EXCELLENT, GOOD, ACCEPTABLE, BAD or VERY_BAD
    private float establishmentRating; //Total rating of establishment
}
