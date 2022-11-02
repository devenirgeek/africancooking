package com.africancooking.backend.model;

public abstract class Menu {

    private String menuName;
    private String menuDescription;
    private String menuPrice;
    //Todo: Implement the parameter "menuPicture";


    public Menu(String menuName, String menuDescription, String menuPrice) {
        this.menuName = menuName;
        this.menuDescription = menuDescription;
        this.menuPrice = menuPrice;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    public String getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(String menuPrice) {
        this.menuPrice = menuPrice;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuName='" + menuName + '\'' +
                ", menuDescription='" + menuDescription + '\'' +
                ", menuPrice='" + menuPrice + '\'' +
                '}';
    }
}
