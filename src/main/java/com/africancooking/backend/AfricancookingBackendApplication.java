package com.africancooking.backend;

import com.africancooking.backend.model.OpeningHours;
import com.africancooking.backend.model.WorkingDaysOfWeek;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AfricancookingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfricancookingBackendApplication.class, args);


        OpeningHours openingHours = new OpeningHours();
        openingHours.setOpeningHoursMap(WorkingDaysOfWeek.MONDAY, "09:00", "20:00");
        openingHours.setOpeningHoursMap(WorkingDaysOfWeek.TUESDAY, "09:00", "20:00");
        openingHours.setOpeningHoursMap(WorkingDaysOfWeek.WEDNESDAY, "09:00", "20:00");
        openingHours.setOpeningHoursMap(WorkingDaysOfWeek.THURSDAY, "09:00", "20:00");
        openingHours.setOpeningHoursMap(WorkingDaysOfWeek.FRIDAY, "09:00", "20:00");
        openingHours.setOpeningHoursMap(WorkingDaysOfWeek.SATURDAY, "09:00", "20:00");
        openingHours.setOpeningHoursMap(WorkingDaysOfWeek.SUNDAY, "09:00", "12:00");


        System.out.print(openingHours.getOpeningHoursMap());
        boolean bool = openingHours.isOpen(WorkingDaysOfWeek.MONDAY, "10:00");
		boolean bool2 = openingHours.isOpen(WorkingDaysOfWeek.MONDAY, "21:00");
        boolean bool3 = openingHours.isOpen(WorkingDaysOfWeek.TUESDAY, "10:00");



	}

}
