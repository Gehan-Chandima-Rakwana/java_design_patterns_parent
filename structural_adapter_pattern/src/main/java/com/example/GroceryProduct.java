package com.example;

public class GroceryProduct implements GroceryItem{
    @Override
    public String getItemName() {
        return "Sugar";
    }
    @Override
    public String getPrice() {
        return "250";
    }

    @Override
    public String getStoreName() {
        return "Keels";
    }
}
