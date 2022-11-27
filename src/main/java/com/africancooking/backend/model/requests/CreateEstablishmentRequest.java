package com.africancooking.backend.model.requests;

import com.africancooking.backend.model.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateEstablishmentRequest {

    private Long ownerID;
    private String name;
    private String country;
    private String city;
    private String zipCode; // PLZ
    private String addressLine1; //Streetname and Housenumber
    private String addressLine2; //Addiional Information
    private String telephoneNumber;
    private String aboutTheEstablishment;
    private String website;

    /*
    //private Set<String> photos;
    private Set<EstablishmentType> establishmentTypes; // The Establishment can offer more than one service
    private Set<Meal> meals;
    private Set<SpecialFeatures> specialFeatures;
    private Set<AlternativeDiets> alternativeDiets;
    private Set<SuitableFor> suitableFor;
    private Set<Kitchen> kitchens;
    private Map<DaysOfWeek, OpeningHours> openingHoursByWorkingDay = new HashMap<>();*/

}
