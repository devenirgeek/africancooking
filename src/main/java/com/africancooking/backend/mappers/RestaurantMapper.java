package com.africancooking.backend.mappers;

import com.africancooking.backend.data.RestaurantData;
import com.africancooking.backend.model.requests.CreateRestaurantRequest;
import com.africancooking.backend.model.responses.CreateRestaurantResponse;

public interface RestaurantMapper {
    RestaurantData mapToRestaurantData(CreateRestaurantRequest request);
    CreateRestaurantResponse mapToCreateRestaurantResponse(RestaurantData savedRestaurant);
}
