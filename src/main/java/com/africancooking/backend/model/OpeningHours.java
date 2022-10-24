package com.africancooking.backend.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OpeningHours {

    private String openingTime;
    private String closingTime;

    private Map<WorkingDaysOfWeek, String> openingTimeMap = new HashMap();
    private Map<WorkingDaysOfWeek, String> closingTimeMap = new HashMap();

    public OpeningHours() {

    }

    public boolean isOpen(WorkingDaysOfWeek day, String time){
        Set<WorkingDaysOfWeek> workingDaySet = openingTimeMap.keySet();
        String startTime;
        String endTime;
        LocalTime timeValue;
        LocalTime startTimeValue;
        LocalTime endTimeValue;

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        try {
            LocalTime localTime = LocalTime.parse(time, timeFormatter);
        }catch (Exception e){
            System.out.println("Unable to convert string to time");
        }

        for(WorkingDaysOfWeek workingDay: workingDaySet) {
            if(day == workingDay){

                startTime = openingTimeMap.get(day);
                endTime = closingTimeMap.get(day);

                try {
                    timeValue = LocalTime.parse(time, timeFormatter);
                    startTimeValue = LocalTime.parse(startTime, timeFormatter);
                    endTimeValue = LocalTime.parse(endTime, timeFormatter);

                    if(timeValue.compareTo(startTimeValue) >= 0 && timeValue.compareTo(endTimeValue) < 0){
                        System.out.println("\n" + "The restaurant is open");
                        return true;
                    }else {
                        System.out.println("\n" + "The restaurant is not open");
                        return false;
                    }

                }catch (Exception e){
                    System.out.println("Unable to convert string startTime and endTime into time format");
                }

            }
        }
        return false;
    }


    public void setOpeningHoursMap(WorkingDaysOfWeek day, String startTime, String endTime){
        openingTimeMap.put(day, startTime);
        closingTimeMap.put(day, endTime);
    }

    public String getOpeningHoursMap(){
        Set<WorkingDaysOfWeek> workingDaySet = openingTimeMap.keySet();
        String value = "";
        for(WorkingDaysOfWeek workingDay: workingDaySet) {
            value = value + "\n" + workingDay + " from " + openingTimeMap.get(workingDay) + " to " + closingTimeMap.get(workingDay);
        }
        return value;
    }

}
