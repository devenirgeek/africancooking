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


    private LocalTime openingTime;
    private LocalTime closingTime;

    public OpeningHour(LocalTime openingTime, LocalTime closingTime) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;

        CheckOpeningAndClosingTime(); //openingTime must be smaller than closingTime
    }


    private void CheckOpeningAndClosingTime(){
        LocalTime value;
        //openingTime must be smaller than closingTime: openingTime - closingTime < 0 --> openingTime is earlier than closingTime
        if(getOpeningTime().compareTo(getClosingTime()) > 0){ // If openingTime - closingTime > 0 then ...
            value = this.openingTime;
            setOpeningTime(closingTime);
            setClosingTime(value);
        }
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public String toString() {
        return "OpeningHour{" +
                "openingtime='" + openingTime + '\'' +
                ", closingTime='" + closingTime + '\'' +
                '}';
    }


    @Override
    public int compareTo(OpeningHour objectToBeCompared) {
        return this.getOpeningTime().compareTo(objectToBeCompared.getOpeningTime());
    }
}
