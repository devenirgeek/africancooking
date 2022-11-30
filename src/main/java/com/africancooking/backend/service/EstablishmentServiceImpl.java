package com.africancooking.backend.service;

import com.africancooking.backend.data.EstablishmentData;
import com.africancooking.backend.data.PersonData;
import com.africancooking.backend.data.UserAccountData;
import com.africancooking.backend.mappers.EstablishmentMapper;
import com.africancooking.backend.mappers.PersonMapper;
import com.africancooking.backend.model.requests.CreateEstablishmentRequest;
import com.africancooking.backend.model.responses.CreateEstablishmentResponse;
import com.africancooking.backend.repositories.EstablishmentRepository;
import com.africancooking.backend.repositories.PersonRepository;
import com.africancooking.backend.repositories.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class EstablishmentServiceImpl implements EstablishmentService {

    private final EstablishmentMapper establishmentMapper;
    private final EstablishmentRepository establishmentRepository;

    private final UserAccountRepository userAccountRepository;

    private final PersonRepository personRepository;

    private final PersonMapper personMapper;


    @Override
    public CreateEstablishmentResponse createEstablishment(CreateEstablishmentRequest request) {
        if(!userAccountRepository.existsById(request.getOwnerID())){
            throw new IllegalArgumentException("User ID does not exist!");
        }
        PersonData personData = personMapper.mapToPersonData(request);
        PersonData savedPersonData = personRepository.save(personData);
        EstablishmentData establishmentData = establishmentMapper.mapToEstablishmentData(request, savedPersonData);
        EstablishmentData savedEstablishment = establishmentRepository.save(establishmentData);
        CreateEstablishmentResponse response = establishmentMapper.mapToCreateEstablishmentResponse(savedEstablishment);
        return response;
    }

}
