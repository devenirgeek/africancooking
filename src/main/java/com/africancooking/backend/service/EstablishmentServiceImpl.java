package com.africancooking.backend.service;

import com.africancooking.backend.data.EstablishmentData;
import com.africancooking.backend.mappers.EstablishmentMapper;
import com.africancooking.backend.model.requests.CreateEstablishmentRequest;
import com.africancooking.backend.model.responses.CreateEstablishmentResponse;
import com.africancooking.backend.repositories.EstablishmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EstablishmentServiceImpl implements EstablishmentService {

    private final EstablishmentMapper establishmentMapper;
    private final EstablishmentRepository establishmentRepository;


    @Override
    public CreateEstablishmentResponse createEstablishment(CreateEstablishmentRequest request) {
        EstablishmentData establishmentData = establishmentMapper.mapToEstablishmentData(request);
        EstablishmentData savedEstablishment = establishmentRepository.save(establishmentData);
        CreateEstablishmentResponse response = establishmentMapper.mapToCreateEstablishmentResponse(savedEstablishment);
        return response;
    }

}
