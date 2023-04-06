package com.example;

public class GroceryItemObjectAdapter implements DeliveryItem{
    private GroceryItem groceryItem;

    public GroceryItemObjectAdapter(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }

    @Override
    public String getItemName() {
        return groceryItem.getItemName();
    }

    @Override
    public String getPrice() {
        return groceryItem.getPrice();
    }

    @Override
    public String getRestaurantName() {
        return groceryItem.getStoreName();
    }
}
