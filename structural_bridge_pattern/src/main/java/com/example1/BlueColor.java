package com.example1;

public class BlueColor implements Color{
    @Override
    public void paint(String shape) {
        System.out.println(shape+ " is printed with color Blue");
    }
}
