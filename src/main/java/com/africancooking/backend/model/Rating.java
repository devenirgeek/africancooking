package com.africancooking.backend.model;

import lombok.Data;

@Data
public class Rating {

    private AppUser webUser;
    private Restaurant restaurant;
    private float scalar;
    private float value;

}
