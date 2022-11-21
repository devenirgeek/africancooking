package com.africancooking.backend.data;

import com.africancooking.backend.model.Address;
import com.africancooking.backend.model.DaysOfWeek;
import com.africancooking.backend.model.OpeningHours;
import com.africancooking.backend.model.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "restaurant_data")
public class RestaurantData {
    @Id
    @GeneratedValue
    private Long id;
    private Person owner;
    private String name;
    private Address address;
    private String telephoneNumber;
    private String aboutRestaurant;
    private String website;
    private Map<DaysOfWeek, OpeningHours> openingHoursByWorkingDay = new HashMap<>();
}
