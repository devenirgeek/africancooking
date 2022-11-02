package com.africancooking.backend.model;

public class Drink {

    private String drinkName;
    private float drinkBottleCapacity;

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public float getDrinkBottleCapacity() {
        return drinkBottleCapacity;
    }

    public void setDrinkBottleCapacity(Float drinkBottleCapacity) {
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
