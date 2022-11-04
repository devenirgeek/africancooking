package com.africancooking.backend.model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Restaurant { // The restaurant should be seen as a kind of resource, a container of information

    private Person restaurantOwner;
    private String restaurantName;
    private Address address;
    private Rating restaurantRating;

    private  Map<WorkingDaysOfWeek, OpeningHours> openingHoursByWorkingDay = new HashMap<>();

    // A Picture can be added
    // List of Menu --> Class Menu must be implemented

    public Restaurant(Person restaurantOwner, String restaurantName, Address address, Map<WorkingDaysOfWeek, OpeningHours> openingHoursByWorkingDay) {
        this.restaurantOwner = restaurantOwner;
        this.restaurantName = restaurantName;
        this.address = address;
        this.openingHoursByWorkingDay = openingHoursByWorkingDay;
    }

    public Person getRestaurantOwner() {
        return restaurantOwner;
    }

    public void setRestaurantOwner(Person restaurantOwner) {
        this.restaurantOwner = restaurantOwner;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<WorkingDaysOfWeek, OpeningHours> getOpeningHoursByWorkingDay() {
        return openingHoursByWorkingDay;
    }

    public void setOpeningHoursByWorkingDay(Map<WorkingDaysOfWeek, OpeningHours> openingHoursByWorkingDay) {
        this.openingHoursByWorkingDay = openingHoursByWorkingDay;
    }

    public boolean isMultipleOpeningDay(WorkingDaysOfWeek day){
        HashSet<OpeningHour> setOfOpeningHours; // Container for the class openingHour

        setOfOpeningHours = openingHoursByWorkingDay.get(day); // Here we get the opening hours container of the working day

        if(setOfOpeningHours.size() >=2 ) {
            return true;
        }
        return false;
    }

    private LocalTime ConvertStringToLocalTime(String time){
        LocalTime localTime = null;

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        try {
            localTime = LocalTime.parse(time, timeFormatter);
        }catch (DateTimeParseException e){
            System.out.println( e.toString() + "\n" + " The text can not be parsed to the local time");
        }

        return localTime;
    }

    public OpeningStatus isOpen(WorkingDaysOfWeek day, String time) {
        Set<WorkingDaysOfWeek> workingDaySet = openingHoursByWorkingDay.keySet();
        LocalTime openingTime;
        LocalTime closingTime;
        LocalTime oneHourBeforeOpening;
        LocalTime oneHourBeforeClosing;
        LocalTime timeValue;
        HashSet<OpeningHour> openingHours; // Container for the class openingHour
        OpeningStatus openingStatus = OpeningStatus.CLOSED;

        for(WorkingDaysOfWeek workingDay: workingDaySet) {

            openingHours = openingHoursByWorkingDay.get(workingDay); // Here we get the opening hours container of the working day

            if(day == workingDay) {
                timeValue = this.ConvertStringToLocalTime(time);

                for (OpeningHour openingHour : openingHours) { //Do this for each item opening hour in container openingHours
                    openingTime = openingHour.getLocalOpeningTime();
                    closingTime = openingHour.getLocalClosingTime();
                    oneHourBeforeOpening = openingTime.minusHours(1);
                    oneHourBeforeClosing = closingTime.minusHours(1);

                    if (timeValue.compareTo(oneHourBeforeOpening) >= 0 && timeValue.compareTo(openingTime) < 0) {
                        openingStatus = OpeningStatus.OPENSOON;
                    } else if (timeValue.compareTo(openingTime) >= 0 && timeValue.compareTo(oneHourBeforeClosing) < 0) {
                        openingStatus = OpeningStatus.OPENED;
                    } else if (timeValue.compareTo(oneHourBeforeClosing) >= 0 && timeValue.compareTo(closingTime) < 0) {
                        openingStatus = OpeningStatus.CLOSESOON;
                    } else {
                        openingStatus = OpeningStatus.CLOSED;
                    }

                    if(openingStatus == OpeningStatus.OPENSOON || openingStatus == OpeningStatus.OPENED || openingStatus == OpeningStatus.CLOSESOON){
                        return openingStatus;
                    }
                }
            }
        }

        return openingStatus; //OpeningStatus.CLOSED;
    }

}
