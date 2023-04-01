package com.example.example1;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable{
    private List<String> vehicleList;

    public Vehicle() {
        this.vehicleList = new ArrayList<String>();
    }

    public Vehicle(List<String> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<String> getVehicleList() {
        return vehicleList;
    }

    public void insertData(){
        vehicleList.add("Honda");
        vehicleList.add("Audi");
        vehicleList.add("BMW");
    }

    // Deep Coping
    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> cloneList = new ArrayList<String>();
        for (String s: this.getVehicleList()){
            cloneList.add(s);
        }
        return new Vehicle(cloneList);
    }
}
