package com.africancooking.backend.model;

public class Restaurant { // The restaurant should be seen as a kind of resource, a container of information

    private User restaurantOwner;
    private Address address;
    private Rating restaurantRating;
    // A Picture can be added
    // List of Menu --> Class Menu must be implemented
    //ToDo: How to model opening hours??? --> It has to be a kind of Hashmap

}
