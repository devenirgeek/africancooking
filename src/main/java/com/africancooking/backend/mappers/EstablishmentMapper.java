package com.africancooking.backend.mappers;

import com.africancooking.backend.data.EstablishmentData;
import com.africancooking.backend.model.requests.CreateEstablishmentRequest;
import com.africancooking.backend.model.responses.CreateEstablishmentResponse;

public interface EstablishmentMapper {
    EstablishmentData mapToEstablishmentData(CreateEstablishmentRequest request);
    CreateEstablishmentResponse mapToCreateEstablishmentResponse(EstablishmentData savedRestaurant);
}
