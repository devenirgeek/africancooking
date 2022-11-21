package com.africancooking.backend.mappers;

import com.africancooking.backend.data.RestaurantData;
import com.africancooking.backend.model.DaysOfWeek;
import com.africancooking.backend.model.OpeningHours;
import com.africancooking.backend.model.requests.CreateRestaurantRequest;
import com.africancooking.backend.model.responses.CreateRestaurantResponse;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class RestaurantMapperImpl implements RestaurantMapper{

    private final Map<DaysOfWeek, OpeningHours> openingHoursByWorkingDay = new HashMap<>();

    @Override
    public RestaurantData mapToRestaurantData(CreateRestaurantRequest request) {
        RestaurantData restaurant = new RestaurantData();
        restaurant.setOwner(request.getOwner());
        restaurant.setName(request.getName());
        restaurant.setAddress(request.getAddress());
        restaurant.setOpeningHoursByWorkingDay(request.getOpeningHoursByWorkingDay());

        return restaurant;
    }

    @Override
    public CreateRestaurantResponse mapToCreateRestaurantResponse(RestaurantData savedRestaurant) {
        CreateRestaurantResponse restaurantResponse = new CreateRestaurantResponse();
        restaurantResponse.setName(savedRestaurant.getName());
        return restaurantResponse;
    }


}
