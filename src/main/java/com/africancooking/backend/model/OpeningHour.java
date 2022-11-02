package com.africancooking.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalTime;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public class OpeningHour implements Comparable<OpeningHour> {

    private String openTime;
    private String closeTime;

    @Override
    public int compareTo(OpeningHour objectToCompare) {
        LocalTime openLocalTime = LocalTime.parse(openTime); // openTime must be parsed
        LocalTime localTime = LocalTime.parse(objectToCompare.getOpenTime()); // openTime must be parsed
        return openLocalTime.compareTo(localTime) ;
    }
}
