package com.example.example1;

import java.util.List;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle vehicle = new Vehicle();
        vehicle.insertData();

        Vehicle cloneVehicle = (Vehicle) vehicle.clone();
        List<String> list = cloneVehicle.getVehicleList();
        list.add("Suzuki");

        System.out.println(vehicle.getVehicleList());
        System.out.println(list);
    }
}
