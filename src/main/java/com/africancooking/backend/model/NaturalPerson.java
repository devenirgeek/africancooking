package com.africancooking.backend.model;

import javax.persistence.Entity;


public class NaturalPerson extends Person {
    private String firstname;
    private String lastname;

    public NaturalPerson(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
