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


    private String openingtime;
    private String closingTime;

    private  DateTimeFormatter timeFormatter;

    public OpeningHour(String openingtime, String closingTime) {
        this.openingtime = openingtime;
        this.closingTime = closingTime;

        timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    }

    public String getOpeningtime() {
        return openingtime;
    }

    public void setOpeningtime(String openingtime) {
        this.openingtime = openingtime;
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
                "openingtime='" + openingtime + '\'' +
                ", closingTime='" + closingTime + '\'' +
                '}';
    }

    public LocalTime getLocalOpeningTime(){
        LocalTime localOpeningTime = null;

        try{
            localOpeningTime = LocalTime.parse(this.openingtime, timeFormatter);
        }catch (DateTimeParseException e){
            System.out.println( e.toString() + "\n" + " The opening time can not be parsed to the local time");
        }

        return localOpeningTime;
    }

    public LocalTime getLocalClosingTime(){
        LocalTime localClosingTime = null;

        try{
            localClosingTime = LocalTime.parse(this.closingTime, timeFormatter);
        }catch (DateTimeParseException e){
            System.out.println( e.toString() + "\n" + " The closing time can not be parsed to the local time");
        }

        return localClosingTime;
    }

    @Override
    public int compareTo(OpeningHour objectToBeCompared) {
        return this.getLocalOpeningTime().compareTo(objectToBeCompared.getLocalOpeningTime());
    }
}
