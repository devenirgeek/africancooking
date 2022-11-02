package com.africancooking.backend.model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The restaurant should be seen as a kind of resource, a container of information
 */
public class Restaurant {

    private Person restaurantOwner;
    private String restaurantName;
    private Address address;
    private Rating restaurantRating;
    private  Map<WorkingDaysOfWeek, OpeningHours> openingHoursByWorkingDay = new HashMap<>();
    private String restaurantPicture;

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

    public boolean isDoubleOpeningDay(WorkingDaysOfWeek day){
/*        List<String> listOfOpeningHours = getOpeningHoursByWorkingDay().get(day).getListOfOpeningHours();
        if(listOfOpeningHours.size() > 2) {
            return true;
        }*/
        return false;
    }

    public String getOpeningHoursByDay(){
        Set<WorkingDaysOfWeek> workingDaySet = openingHoursByWorkingDay.keySet();
        OpeningHours listOfOpeningHours = new OpeningHours();
        String result = "";

        for(WorkingDaysOfWeek workingDay: workingDaySet) {

            listOfOpeningHours = openingHoursByWorkingDay.get(workingDay);
/*
            if (!isDoubleOpeningDay(workingDay)) {
                result += " " + workingDay.toString() + ": " + listOfOpeningHours.get(0) + " - " + listOfOpeningHours.get(1) + "\n";
                //return (workingDay.toString() + ": " + listOfOpeningHours.get(0) + " - " + listOfOpeningHours.get(1) + "\n");
                //System.out.println(workingDay.toString() + ": " + listOfOpeningHours.get(0) + " - " + listOfOpeningHours.get(1) + "\n");
            } else {
                result += " " + workingDay.toString() + ": " + listOfOpeningHours.get(0) + " - " + listOfOpeningHours.get(1) + " and " + listOfOpeningHours.get(2) + " - " + listOfOpeningHours.get(3) + "\n";
                //System.out.println(workingDay.toString() + ": " + listOfOpeningHours.get(0) + " - " + listOfOpeningHours.get(1) + " and " + listOfOpeningHours.get(2) + " - " + listOfOpeningHours.get(3) + "\n");
                //return (workingDay.toString() + ": " + listOfOpeningHours.get(0) + " - " + listOfOpeningHours.get(1) + " and " + listOfOpeningHours.get(3) + " - " + listOfOpeningHours.get(3) + "\n");
            }*/

        }

        return result;
    }

    public OpeningStatus isOpen(WorkingDaysOfWeek day, String time){
        Set<WorkingDaysOfWeek> workingDaySet = openingHoursByWorkingDay.keySet();
        String openingTimeString;
        String closingTimeString;
        LocalTime timeValue;
        LocalTime openingTime;
        LocalTime closingTime;
        LocalTime oneHourBeforeOpening;
        LocalTime oneHourBeforeClosing;
        List<String> listOfOpeningHours = new ArrayList<>();


        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        try {
            LocalTime localTime = LocalTime.parse(time, timeFormatter);
        }catch (Exception e){
            System.out.println("Unable to convert string to time");
        }

        for(WorkingDaysOfWeek workingDay: workingDaySet) {

            if(day == workingDay){

                //listOfOpeningHours = openingHoursByWorkingDay.get(day).getListOfOpeningHours();
                listOfOpeningHours = new ArrayList<>();

                if(!isDoubleOpeningDay(day)) {

                    openingTimeString = listOfOpeningHours.get(0);
                    closingTimeString = listOfOpeningHours.get(1);

                    try {
                        timeValue = LocalTime.parse(time, timeFormatter);
                        openingTime = LocalTime.parse(openingTimeString, timeFormatter);
                        closingTime = LocalTime.parse(closingTimeString, timeFormatter);
                        oneHourBeforeOpening = openingTime.minusHours(1);
                        oneHourBeforeClosing = closingTime.minusHours(1);

                        if (timeValue.compareTo(oneHourBeforeOpening) >= 0 && timeValue.compareTo(openingTime) < 0) {
                            System.out.println("\n" + "The restaurant open soon");
                            return OpeningStatus.OPENSOON;
                        } else if (timeValue.compareTo(openingTime) >= 0 && timeValue.compareTo(oneHourBeforeClosing) < 0) {
                            System.out.println("\n" + "The restaurant is opened");
                            return OpeningStatus.OPENED;
                        } else if (timeValue.compareTo(oneHourBeforeClosing) >= 0 && timeValue.compareTo(closingTime) < 0) {
                            System.out.println("\n" + "The restaurant close soon");
                            return OpeningStatus.CLOSESOON;
                        } else {
                            System.out.println("\n" + "The restaurant is not opened");
                            return OpeningStatus.CLOSED;
                        }

                    } catch (Exception e) {
                        System.out.println("Unable to convert string openingTimeString and closingTimeString into time format");
                    }
                }else{ //Check if it is a day with double opening

                    String secondOpeningTimeString;
                    String secondClosingTimeString;
                    LocalTime secondOpeningTime;
                    LocalTime secondClosingTime;
                    LocalTime oneHourBeforeSecondOpening;
                    LocalTime oneHourBeforeSecondClosing;

                    openingTimeString = listOfOpeningHours.get(0);
                    closingTimeString = listOfOpeningHours.get(1);
                    secondOpeningTimeString = listOfOpeningHours.get(2);
                    secondClosingTimeString = listOfOpeningHours.get(3);

                    try {
                        timeValue = LocalTime.parse(time, timeFormatter);
                        openingTime = LocalTime.parse(openingTimeString, timeFormatter);
                        closingTime = LocalTime.parse(closingTimeString, timeFormatter);
                        oneHourBeforeOpening = openingTime.minusHours(1);
                        oneHourBeforeClosing = closingTime.minusHours(1);

                        secondOpeningTime = LocalTime.parse(secondOpeningTimeString, timeFormatter);
                        secondClosingTime = LocalTime.parse(secondClosingTimeString, timeFormatter);
                        oneHourBeforeSecondOpening = secondOpeningTime.minusHours(1);
                        oneHourBeforeSecondClosing = secondClosingTime.minusHours(1);

                        if ((timeValue.compareTo(oneHourBeforeOpening) >= 0 && timeValue.compareTo(openingTime) < 0) || (timeValue.compareTo(oneHourBeforeSecondOpening) >= 0 && timeValue.compareTo(secondOpeningTime) < 0)) {
                            System.out.println("\n" + "The restaurant open soon");
                            return OpeningStatus.OPENSOON;
                        } else if ((timeValue.compareTo(openingTime) >= 0 && timeValue.compareTo(oneHourBeforeClosing) < 0) || (timeValue.compareTo(secondOpeningTime) >= 0 && timeValue.compareTo(oneHourBeforeSecondClosing) < 0)) {
                            System.out.println("\n" + "The restaurant is opened");
                            return OpeningStatus.OPENED;
                        } else if ((timeValue.compareTo(oneHourBeforeClosing) >= 0 && timeValue.compareTo(closingTime) < 0) || (timeValue.compareTo(oneHourBeforeSecondClosing) >= 0 && timeValue.compareTo(secondClosingTime) < 0)) {
                            System.out.println("\n" + "The restaurant close soon");
                            return OpeningStatus.CLOSESOON;
                        } else {
                            System.out.println("\n" + "The restaurant is not opened");
                            return OpeningStatus.CLOSED;
                        }

                    } catch (Exception e) {
                        System.out.println("Unable to convert string openingTimeString and closingTimeString into time format");
                    }

                }

            }
        }
        return OpeningStatus.CLOSED;
    }


}
