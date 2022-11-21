package com.africancooking.backend.model.requests;

import com.africancooking.backend.model.Address;
import com.africancooking.backend.model.DaysOfWeek;
import com.africancooking.backend.model.OpeningHours;
import com.africancooking.backend.model.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateRestaurantRequest {

    private Person owner;
    private String name;
    private Address address;
    private String telephoneNumber;
    private String aboutRestaurant;
    private String website;
    private Map<DaysOfWeek, OpeningHours> openingHoursByWorkingDay = new HashMap<>();

}
