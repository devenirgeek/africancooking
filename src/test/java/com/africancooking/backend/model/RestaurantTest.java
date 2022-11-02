package com.africancooking.backend.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class RestaurantTest {

    private Restaurant classUnderTest;
    private String restaurantName = "";
    private Map<WorkingDaysOfWeek, OpeningHours> restaurantOpeningHours;

    private String companyName;
    private String legalForm;
    private Set<String> companyDirectors;


    @BeforeEach
    /*@BeforeEach: Methode wir vor jedem Test aufgerufen */
    public void setUp(){
        companyName = "BeinSport";
        legalForm = "GmbH";
        companyDirectors = new HashSet<>();

        Person restaurantOwner = new LegalPerson(companyName, legalForm, companyDirectors);
        restaurantName = "TestName";
        Address restaurantAddress = new Address();
        restaurantOpeningHours = new HashMap<>();


        restaurantOpeningHours.put(WorkingDaysOfWeek.MONDAY, new OpeningHours(List.of("09:00", "22:00")));
        restaurantOpeningHours.put(WorkingDaysOfWeek.TUESDAY, new OpeningHours(List.of("09:00", "12:00", "14:00", "22:00")));
        restaurantOpeningHours.put(WorkingDaysOfWeek.WEDNESDAY, new OpeningHours(List.of("14:00", "22:00")));
        restaurantOpeningHours.put(WorkingDaysOfWeek.THURSDAY, new OpeningHours(List.of("09:00", "12:00", "14:00", "22:00")));
        restaurantOpeningHours.put(WorkingDaysOfWeek.FRIDAY, new OpeningHours(List.of("09:00", "22:00")));
        restaurantOpeningHours.put(WorkingDaysOfWeek.SATURDAY, new OpeningHours(List.of("09:00", "16:00")));

        classUnderTest = new Restaurant(restaurantOwner, restaurantName, restaurantAddress, restaurantOpeningHours);


    }
    @Test
    public void restaurantNameTest(){
        System.out.println(classUnderTest.getOpeningHoursByDay());
        Assertions.assertEquals("TestName", classUnderTest.getRestaurantName());
    }
    @Test
    public void isDoubleOpeningDayTest(){
        Assertions.assertTrue(classUnderTest.isDoubleOpeningDay(WorkingDaysOfWeek.TUESDAY));
    }
    @Test
    public void isOpenTest(){
        Assertions.assertEquals(OpeningStatus.CLOSED, classUnderTest.isOpen(WorkingDaysOfWeek.SUNDAY, "11:00"));
        Assertions.assertEquals(OpeningStatus.OPENED, classUnderTest.isOpen(WorkingDaysOfWeek.MONDAY, "10:00"));

        Assertions.assertEquals(OpeningStatus.OPENSOON, classUnderTest.isOpen(WorkingDaysOfWeek.TUESDAY, "08:30"));
        Assertions.assertEquals(OpeningStatus.OPENED, classUnderTest.isOpen(WorkingDaysOfWeek.TUESDAY, "09:30"));
        Assertions.assertEquals(OpeningStatus.CLOSESOON, classUnderTest.isOpen(WorkingDaysOfWeek.TUESDAY, "11:30"));
        Assertions.assertEquals(OpeningStatus.CLOSED, classUnderTest.isOpen(WorkingDaysOfWeek.TUESDAY, "12:01"));

    }



}
