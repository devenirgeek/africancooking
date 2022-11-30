package com.africancooking.backend.mappers;

import com.africancooking.backend.data.PersonData;
import com.africancooking.backend.model.requests.CreateEstablishmentRequest;
import org.springframework.stereotype.Component;

@Component
public class PersonMapperImpl implements PersonMapper{
    @Override
    public PersonData mapToPersonData(CreateEstablishmentRequest request) {
        PersonData personData = new PersonData();

        personData.setEstablishmentName(request.getEstablishmentName());
        personData.setPersonType(request.getPersonType());
        return personData;
    }
}
