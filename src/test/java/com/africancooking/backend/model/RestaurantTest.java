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

    private OpeningHours openingHours1;
    private OpeningHours openingHours2;
    private OpeningHours openingHours3;
    private OpeningHours openingHours4;


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
        openingHours1 = new OpeningHours();
        openingHours2= new OpeningHours();
        openingHours3 = new OpeningHours();
        openingHours4 = new OpeningHours();


        openingHours1.addAll(Set.of(new OpeningHour("08:00", "12:00"), new OpeningHour("14:00", "18:00"), new OpeningHour("16:00", "22:00")));
        restaurantOpeningHours.put(WorkingDaysOfWeek.MONDAY, openingHours1);


        openingHours2.addAll(Set.of(new OpeningHour("09:00", "12:00"), new OpeningHour("16:00", "22:00")));
        restaurantOpeningHours.put(WorkingDaysOfWeek.TUESDAY, openingHours2);


        openingHours3.addAll(Set.of(new OpeningHour("08:00", "20:00")));
        restaurantOpeningHours.put(WorkingDaysOfWeek.WEDNESDAY, openingHours3);


        openingHours4.add(new OpeningHour("12:00", "22:00"));
        restaurantOpeningHours.put(WorkingDaysOfWeek.FRIDAY, openingHours4);


        classUnderTest = new Restaurant(restaurantOwner, restaurantName, restaurantAddress, restaurantOpeningHours);


    }

    @Test
    public void isMultipleOpeningDayTest(){
        Assertions.assertTrue(classUnderTest.isMultipleOpeningDay(WorkingDaysOfWeek.MONDAY));
        Assertions.assertTrue(classUnderTest.isMultipleOpeningDay(WorkingDaysOfWeek.TUESDAY));
        Assertions.assertFalse(classUnderTest.isMultipleOpeningDay(WorkingDaysOfWeek.WEDNESDAY));
    }
    @Test
    public void isOpenTest(){
        Assertions.assertEquals(OpeningStatus.CLOSED, classUnderTest.isOpen(WorkingDaysOfWeek.SUNDAY, "11:00"));
        Assertions.assertEquals(OpeningStatus.OPENED, classUnderTest.isOpen(WorkingDaysOfWeek.MONDAY, "10:00"));
        Assertions.assertEquals(OpeningStatus.OPENSOON, classUnderTest.isOpen(WorkingDaysOfWeek.MONDAY, "13:01"));
        Assertions.assertEquals(OpeningStatus.OPENED, classUnderTest.isOpen(WorkingDaysOfWeek.MONDAY, "14:30"));

        Assertions.assertEquals(OpeningStatus.OPENSOON, classUnderTest.isOpen(WorkingDaysOfWeek.TUESDAY, "08:30"));
        Assertions.assertEquals(OpeningStatus.OPENED, classUnderTest.isOpen(WorkingDaysOfWeek.TUESDAY, "09:30"));
        Assertions.assertEquals(OpeningStatus.CLOSESOON, classUnderTest.isOpen(WorkingDaysOfWeek.TUESDAY, "11:30"));
        Assertions.assertEquals(OpeningStatus.CLOSED, classUnderTest.isOpen(WorkingDaysOfWeek.TUESDAY, "12:01"));

        Assertions.assertEquals(OpeningStatus.OPENSOON, classUnderTest.isOpen(WorkingDaysOfWeek.WEDNESDAY, "07:01"));
        Assertions.assertEquals(OpeningStatus.OPENED, classUnderTest.isOpen(WorkingDaysOfWeek.WEDNESDAY, "12:01"));
        Assertions.assertEquals(OpeningStatus.CLOSESOON, classUnderTest.isOpen(WorkingDaysOfWeek.WEDNESDAY, "19:01"));
        Assertions.assertEquals(OpeningStatus.CLOSED, classUnderTest.isOpen(WorkingDaysOfWeek.WEDNESDAY, "22:01"));

        Assertions.assertEquals(OpeningStatus.CLOSED, classUnderTest.isOpen(WorkingDaysOfWeek.THURSDAY, "11:00"));
        Assertions.assertEquals(OpeningStatus.CLOSED, classUnderTest.isOpen(WorkingDaysOfWeek.THURSDAY, "18:00"));

        Assertions.assertEquals(OpeningStatus.OPENSOON, classUnderTest.isOpen(WorkingDaysOfWeek.FRIDAY, "11:59"));
        Assertions.assertEquals(OpeningStatus.OPENED, classUnderTest.isOpen(WorkingDaysOfWeek.FRIDAY, "16:59"));
        Assertions.assertEquals(OpeningStatus.CLOSESOON, classUnderTest.isOpen(WorkingDaysOfWeek.FRIDAY, "21:00"));
        Assertions.assertEquals(OpeningStatus.CLOSED, classUnderTest.isOpen(WorkingDaysOfWeek.FRIDAY, "22:00"));
    }



}
