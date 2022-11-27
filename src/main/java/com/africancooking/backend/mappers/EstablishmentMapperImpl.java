package com.africancooking.backend.mappers;

import com.africancooking.backend.data.EstablishmentData;
import com.africancooking.backend.model.DaysOfWeek;
import com.africancooking.backend.model.OpeningHours;
import com.africancooking.backend.model.requests.CreateEstablishmentRequest;
import com.africancooking.backend.model.responses.CreateEstablishmentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class EstablishmentMapperImpl implements EstablishmentMapper {

    private final Map<DaysOfWeek, OpeningHours> openingHoursByWorkingDay = new HashMap<>();

    @Override
    public EstablishmentData mapToEstablishmentData(CreateEstablishmentRequest request) {
        EstablishmentData establishment = new EstablishmentData();

        establishment.setName(request.getName());
        /*establishment.setOwner(request.getOwner());
        establishment.setAddress(request.getAddress());
        establishment.setTelephoneNumber(request.getTelephoneNumber());
        establishment.setAboutEstablishment(request.getAboutTheEstablishment());
        establishment.setWebsite(request.getWebsite());
        establishment.setMeals(request.getMeals());
        establishment.setKitchens(request.getKitchens());
        establishment.setSpecialFeatures(request.getSpecialFeatures());
        establishment.setAlternativeDiets(request.getAlternativeDiets());
        establishment.setSuitableFor(request.getSuitableFor());
        establishment.setEstablishmentTypes(request.getEstablishmentTypes());
        establishment.setOpeningHoursByWorkingDay(request.getOpeningHoursByWorkingDay());*/

        return establishment;
    }

    @Override
    public CreateEstablishmentResponse mapToCreateEstablishmentResponse(EstablishmentData savedEstablishmentData) {
        CreateEstablishmentResponse establishmentResponse = new CreateEstablishmentResponse();
        establishmentResponse.setName(savedEstablishmentData.getName());
        /*establishmentResponse.setAddress(savedEstablishmentData.getAddress());
        establishmentResponse.setTelephoneNumber(savedEstablishmentData.getTelephoneNumber());
        establishmentResponse.setAboutEstablishment(savedEstablishmentData.getAboutEstablishment());
        establishmentResponse.setWebsite(savedEstablishmentData.getWebsite());*/
        return establishmentResponse;
    }


}
