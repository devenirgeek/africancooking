package com.africancooking.backend.model;

import java.util.List;

public class OpeningHour {

    private List<String> listOfOpeningHours;

    public OpeningHour(List<String> workingTime) {
        this.listOfOpeningHours = workingTime;
    }

    public List<String> getListOfOpeningHours() {
        return listOfOpeningHours;
    }

    public void setListOfOpeningHours(List<String> listOfOpeningHours) {
        this.listOfOpeningHours = listOfOpeningHours;
    }

}
