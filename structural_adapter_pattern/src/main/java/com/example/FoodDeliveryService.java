package com.example;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliveryService {
    List<DeliveryItem> deliveryItems = new ArrayList<>();

    public void addDeliveryItems(DeliveryItem item){
        deliveryItems.add(item);
    }

    public List<DeliveryItem> getDeliveryItems(){
        return deliveryItems;
    }

}
