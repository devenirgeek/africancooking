package com.africancooking.backend.service;

import com.africancooking.backend.model.Restaurant;

public class RestaurantService {

    private Restaurant restaurant;

    public RestaurantService(Restaurant restaurant) {
        this.restaurant = restaurant;
    }


    public boolean createRestaurant(Restaurant restaurant){
        System.out.println("The restaurant has been successfully created");

        return false;
    }
}
