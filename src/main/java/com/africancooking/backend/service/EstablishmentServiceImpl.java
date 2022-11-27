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
        //ToDo: Find UserAccount by ID in the UserAccountRepository
        //ToDo: Add --> establishmentData.setOwner() --> Add all the property of EstablishmentData by using Set-Methode before to save all the information in the database;
        EstablishmentData savedEstablishment = establishmentRepository.save(establishmentData);
        CreateEstablishmentResponse response = establishmentMapper.mapToCreateEstablishmentResponse(savedEstablishment);
        return response;
    }

}
