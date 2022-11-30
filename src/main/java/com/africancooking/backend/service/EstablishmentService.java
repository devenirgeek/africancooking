package com.africancooking.backend.service;

import com.africancooking.backend.data.PersonData;
import com.africancooking.backend.model.requests.CreateEstablishmentRequest;
import com.africancooking.backend.model.responses.CreateEstablishmentResponse;

/*Here we will implement all the methods to respond to all the requests regarding restaurant*/
public interface EstablishmentService {
    CreateEstablishmentResponse createEstablishment(CreateEstablishmentRequest request);
}
