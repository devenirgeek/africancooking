package com.africancooking.backend.service;

import com.africancooking.backend.model.requests.CreateEstablishmentRequest;
import com.africancooking.backend.model.responses.CreateEstablishmentResponse;

/*Here we will implement all the methods to respond to all the requests regarding restaurant*/
public interface RestaurantService {
    CreateEstablishmentResponse createRestaurant(CreateEstablishmentRequest request);
}
