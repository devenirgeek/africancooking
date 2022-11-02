package com.africancooking.backend.model;

import lombok.Data;

@Data
public class Rating {
    private WebUser webUser;
    private Restaurant restaurant;
    private float scalar;
    private float value;
}
