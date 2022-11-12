package com.africancooking.backend.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * class OpeningHours
 * A restaurant may open and close more than once a day, for example from 08:00 to 12:00 and then 14:00 to 20:00.
 * The OpeningHours class allows you to monitor this. This class is in fact a container of object of type OpeningHour.
 * In our case we will define the class OpeningHours as an extension of the HashSet<OpeningHours> class.
 * Why an extension of the HashSet class?
 * Because an element cannot be added more than once to a HashSet.
 * Warning:
 * It is necessary to define the order in which the elements will be stored in the HashSet
 */
public class OpeningHours extends HashSet<OpeningHour> {


}
