package com.africancooking.backend.model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


/**
 * class OpeningHour
 * The class OpeningHour consists of an opening and a closing time.
 * The opening and a closing time are attributes of type String of the class OpeningHour.
 * These two attributes can be parsed into LocalTime using the methods getLocalOpeningTime() and getLocalClosingTime().
 *
 * The method "compareTo(OpeningHour objectToBeCompared)" compares two objects A and B of type OpeningHour based on the opening time.
 * If for example the opening time of object A is 07:00 and that of B is 08:00 then the result of A.compareTo(B) is: -1
 * If for example the opening time of object A is 07:00 and that of B is 07:00 then the result of A.compareTo(B) is: 0
 * If for example the opening time of object A is 08:00 and that of B is 07:00 then the result of A.compareTo(B) is: 1
 *
 */
public class OpeningHour implements Comparable<OpeningHour> {


    private String openingTime;
    private String closingTime;

    private  DateTimeFormatter timeFormatter;

    public OpeningHour(String openingTime, String closingTime) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;

        this.timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        CheckOpeningAndClosingTime(); //openingTime must be smaller than closingTime
    }

    private LocalTime ConvertStringToLocalTime(String time){
        LocalTime localTime = null;

        try {
            localTime = LocalTime.parse(time, this.timeFormatter);
        }catch (DateTimeParseException e){
            System.out.println( e.toString() + "\n" + " The text can not be parsed to the local time");
        }

        return localTime;
    }

    private void CheckOpeningAndClosingTime(){
        String value;
        //openingTime must be smaller than closingTime: openingTime - closingTime < 0 --> openingTime is earlier than closingTime
        if(getLocalOpeningTime().compareTo(getLocalClosingTime()) > 0){ // If openingTime - closingTime > 0 then ...
            value = this.openingTime;
            setOpeningTime(closingTime);
            setClosingTime(value);
        }
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public String toString() {
        return "OpeningHour{" +
                "openingtime='" + openingTime + '\'' +
                ", closingTime='" + closingTime + '\'' +
                '}';
    }

    public LocalTime getLocalOpeningTime(){
        LocalTime localOpeningTime = this.ConvertStringToLocalTime(this.openingTime);
        return localOpeningTime;
    }

    public LocalTime getLocalClosingTime(){
        LocalTime localClosingTime = this.ConvertStringToLocalTime(this.closingTime);
        return localClosingTime;
    }

    @Override
    public int compareTo(OpeningHour objectToBeCompared) {
        return this.getLocalOpeningTime().compareTo(objectToBeCompared.getLocalOpeningTime());
    }
}
