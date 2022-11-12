package com.africancooking.backend.model;


public abstract class Person {
    private Address userAddress;

    public Address getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(Address userAddress) {
        this.userAddress = userAddress;
    }
}
