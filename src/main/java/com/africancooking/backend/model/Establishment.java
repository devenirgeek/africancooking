package com.africancooking.backend.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Data
public class Establishment {

    private Person owner;
    private String name;
    private Address address;
    private String telephoneNumber;
    private String aboutTheEstablishment;
    private String website;

    private Set<String> photos;
    private Set<EstablishmentType> establishmentTypes; // The Establishment can offer more than one service
    private Set<Meal> meals; // BREAKFAST, LUNCH or DINNER
    private Set<SpecialFeatures> specialFeatures;
    private Set<AlternativeDiets> alternativeDiets;
    private Set<SuitableFor> suitableFor;
    private Set<Kitchen> kitchens;
    private Map<DaysOfWeek, OpeningHours> openingHoursByWorkingDay = new HashMap<>();

}
