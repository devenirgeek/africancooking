package com.africancooking.backend.mappers;

import com.africancooking.backend.data.EstablishmentData;
import com.africancooking.backend.data.PersonData;
import com.africancooking.backend.model.DaysOfWeek;
import com.africancooking.backend.model.OpeningHours;
import com.africancooking.backend.model.requests.CreateEstablishmentRequest;
import com.africancooking.backend.model.responses.CreateEstablishmentResponse;
import com.africancooking.backend.repositories.EstablishmentRepository;
import com.africancooking.backend.repositories.PersonRepository;
import com.africancooking.backend.repositories.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class EstablishmentMapperImpl implements EstablishmentMapper {

    private final Map<DaysOfWeek, OpeningHours> openingHoursByWorkingDay = new HashMap<>();
    private final PersonMapper personMapper;
    private final UserAccountRepository userAccountRepository;

    @Override
    public EstablishmentData mapToEstablishmentData(CreateEstablishmentRequest request, PersonData savedPersonData) {
        EstablishmentData establishmentData = new EstablishmentData();

        establishmentData.setOwner(savedPersonData);
        establishmentData.setEstablishmentName(request.getEstablishmentName());
        establishmentData.setCity(request.getCity());
        establishmentData.setZipCode(request.getZipCode());
        establishmentData.setCountry(request.getCountry());
        establishmentData.setAddressLine1(request.getAddressLine1());
        establishmentData.setAddressLine2(request.getAddressLine2());
        establishmentData.setTelephoneNumber(request.getTelephoneNumber());
        establishmentData.setWebsite(request.getWebsite());
        establishmentData.setAboutTheEstablishment(request.getAboutTheEstablishment());




        /*EstablishmentData establishment = new EstablishmentData();
        PersonData personData = personMapper.mapToPersonData(request);

        establishment.setEstablishmentName(request.getEstablishmentName());
        establishment.setOwner(personData);

        establishment.setEstablishmentName(request.getEstablishmentName());
        establishment.setTelephoneNumber(request.getTelephoneNumber());
        establishment.setAboutTheEstablishment(request.getAboutTheEstablishment());
        establishment.setWebsite(request.getWebsite());
        establishment.setCountry(request.getCountry());
        establishment.setZipCode(request.getZipCode());
        establishment.setAddressLine1(request.getAddressLine1());
        establishment.setAddressLine2(request.getAddressLine2());

        establishment.setMeals(request.getMeals());
        establishment.setKitchens(request.getKitchens());
        establishment.setSpecialFeatures(request.getSpecialFeatures());
        establishment.setAlternativeDiets(request.getAlternativeDiets());
        establishment.setSuitableFor(request.getSuitableFor());
        establishment.setEstablishmentTypes(request.getEstablishmentTypes());
        establishment.setOpeningHoursByWorkingDay(request.getOpeningHoursByWorkingDay());*/

        return establishmentData;
    }

    @Override
    public CreateEstablishmentResponse mapToCreateEstablishmentResponse(EstablishmentData savedEstablishmentData) {
        CreateEstablishmentResponse establishmentResponse = new CreateEstablishmentResponse();
        establishmentResponse.setEstablishmentName(savedEstablishmentData.getEstablishmentName());
        establishmentResponse.setTelephoneNumber(savedEstablishmentData.getTelephoneNumber());
        establishmentResponse.setWebsite(savedEstablishmentData.getWebsite());
        return establishmentResponse;
    }


}
