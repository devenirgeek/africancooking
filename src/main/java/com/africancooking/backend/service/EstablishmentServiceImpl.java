package com.africancooking.backend.service;

import com.africancooking.backend.data.EstablishmentData;
import com.africancooking.backend.mappers.RestaurantMapper;
import com.africancooking.backend.model.requests.CreateEstablishmentRequest;
import com.africancooking.backend.model.responses.CreateEstablishmentResponse;
import com.africancooking.backend.repositories.EstablishmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService{

    private final RestaurantMapper restaurantMapper;
    private final EstablishmentRepository restaurantRepository;


    @Override
    public CreateEstablishmentResponse createRestaurant(CreateEstablishmentRequest request) {
        EstablishmentData restaurantData = restaurantMapper.mapToRestaurantData(request);
        EstablishmentData savedRestaurant = restaurantRepository.save(restaurantData);
        CreateEstablishmentResponse response = restaurantMapper.mapToCreateRestaurantResponse(savedRestaurant);
        return response;
    }

}
