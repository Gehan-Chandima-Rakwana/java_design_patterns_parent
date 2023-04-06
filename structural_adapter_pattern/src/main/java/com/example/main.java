package com.example;

import java.util.List;

public class main {
    public static void main(String[] args) {
        FoodDeliveryService service = new FoodDeliveryService();
        service.addDeliveryItems(new FoodProduct());
        service.addDeliveryItems(new FoodProduct());

        service.addDeliveryItems(new GroceryItemObjectAdapter(new GroceryProduct()));

        // Print delivery items
        List<DeliveryItem> list = service.getDeliveryItems();
        for (DeliveryItem i: list){
            System.out.println(i.getItemName()+","+i.getPrice()+","+i.getRestaurantName());
        }
    }
}
