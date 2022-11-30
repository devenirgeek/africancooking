package com.africancooking.backend.mappers;

import com.africancooking.backend.data.PersonData;
import com.africancooking.backend.model.requests.CreateEstablishmentRequest;

public interface PersonMapper {
    PersonData mapToPersonData(CreateEstablishmentRequest request);
}
