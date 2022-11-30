package com.africancooking.backend.model.responses;

import com.africancooking.backend.model.Address;
import com.africancooking.backend.model.Status;
import lombok.Data;

@Data
public class CreateEstablishmentResponse {
    private String establishmentName;
    private String telephoneNumber;
    private String website;
}
