package com.africancooking.backend.model.responses;

import com.africancooking.backend.model.Address;
import com.africancooking.backend.model.Status;
import lombok.Data;

@Data
public class CreateEstablishmentResponse {
    private Status createRestaurantStatus = Status.SUCCESS;
    private String name;
    private Address address;
    private String telephoneNumber;
    private String aboutEstablishment;
    private String website;
}
