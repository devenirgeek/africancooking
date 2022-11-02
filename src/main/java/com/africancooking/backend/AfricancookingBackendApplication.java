package com.africancooking.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AfricancookingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfricancookingBackendApplication.class, args);

/*
        OpeningHour openingHour = new OpeningHour();
        openingHour.setOpeningHoursMap(WorkingDaysOfWeek.MONDAY, "09:00", "20:00");
        openingHour.setOpeningHoursMap(WorkingDaysOfWeek.TUESDAY, "09:00", "20:00");
        openingHour.setOpeningHoursMap(WorkingDaysOfWeek.WEDNESDAY, "09:00", "20:00");
        openingHour.setOpeningHoursMap(WorkingDaysOfWeek.THURSDAY, "09:00", "20:00");
        openingHour.setOpeningHoursMap(WorkingDaysOfWeek.FRIDAY, "09:00", "20:00");
        openingHour.setOpeningHoursMap(WorkingDaysOfWeek.SATURDAY, "09:00", "20:00");
        openingHour.setOpeningHoursMap(WorkingDaysOfWeek.SUNDAY, "09:00", "12:00");


        System.out.print(openingHour.getOpeningHoursMap());
        boolean bool = openingHour.isOpen(WorkingDaysOfWeek.MONDAY, "10:00");
		boolean bool2 = openingHour.isOpen(WorkingDaysOfWeek.MONDAY, "21:00");
        boolean bool3 = openingHour.isOpen(WorkingDaysOfWeek.TUESDAY, "10:00");
*/

	}

}
