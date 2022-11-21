package com.africancooking.backend.model;

import java.util.HashMap;
import java.util.Map;

public class RestaurantType {
    
    private Person owner;
    private String name;
    private Address address;
    private String telephoneNumber;
    private String aboutRestaurant;
    private String website;
    private Map<DaysOfWeek, OpeningHours> openingHoursByWorkingDay = new HashMap<>();

}
