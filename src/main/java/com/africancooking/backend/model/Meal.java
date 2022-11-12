package com.africancooking.backend.model;

import java.util.Set;

/**
 * Un Menu un un conteur de plusieurs type de repas (Starters, MainCourses, Desserts, Drinks)
 */
public abstract class Meal {

    private String name;
    private String description;
    private float price;
    private String picture;

    public Meal(String name, String description, float price, String picture) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                '}';
    }

}
