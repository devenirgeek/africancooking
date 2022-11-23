package com.africancooking.backend.data;

import com.africancooking.backend.model.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "establishment_data")
public class EstablishmentData {
    @Id
    @GeneratedValue
    private Long id;
    private Person owner;
    private String name;
    /*private Address address;
    private String telephoneNumber;
    private String aboutEstablishment;
    private String website;

    private Set<String> photos;
    private Set<EstablishmentType> establishmentTypes; // The Establishment can offer more than one service
    private Set<Meal> meals;
    private Set<SpecialFeatures> specialFeatures;
    private Set<AlternativeDiets> alternativeDiets;
    private Set<SuitableFor> suitableFor;
    private Set<Kitchen> kitchens;
    private Map<DaysOfWeek, OpeningHours> openingHoursByWorkingDay;*/
}
