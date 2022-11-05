package com.africancooking.backend.model;

public class Drink {
    private String drinkName;
    private float drinkBottleCapacity;
    private float price;

    public Drink(String drinkName, float price) {
        this.drinkName = drinkName;
        this.price = price;
    }

    public Drink(String drinkName, float drinkBottleCapacity, float price) {
        this.drinkName = drinkName;
        this.drinkBottleCapacity = drinkBottleCapacity;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public float getDrinkBottleCapacity() {
        return drinkBottleCapacity;
    }

    public void setDrinkBottleCapacity(float drinkBottleCapacity) {
        this.drinkBottleCapacity = drinkBottleCapacity;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkName='" + drinkName + '\'' +
                ", drinkBottleCapacity=" + drinkBottleCapacity +
                '}';
    }
}
