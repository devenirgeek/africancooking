package com.africancooking.backend.model;

import java.util.List;

public class OpeningHours {

    private List<String> listOfOpeningHours;

    public OpeningHours(List<String> openingHours) {
        this.listOfOpeningHours = openingHours;
    }

    public List<String> getListOfOpeningHours() {
        return listOfOpeningHours;
    }

    public void setListOfOpeningHours(List<String> listOfOpeningHours) {
        this.listOfOpeningHours = listOfOpeningHours;
    }


}
