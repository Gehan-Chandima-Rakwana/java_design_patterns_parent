package com.example;

public class FoodProduct implements DeliveryItem{
    @Override
    public String getItemName() {
        return "Pizza";
    }

    @Override
    public String getPrice() {
        return "1500";
    }

    @Override
    public String getRestaurantName() {
        return "Pizza Hut";
    }
}
