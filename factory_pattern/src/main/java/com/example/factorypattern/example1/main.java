package com.example.factorypattern.example1;

public class main {
    public static void main(String[] args){
        OperatingSystem obj = OperatingSystemFactory.getInstance("Windows","2.0","OS");
        obj.changeDir();
        obj.removeDir();
        obj.printVersionAndArchitecture();

        OperatingSystem obj1 = OperatingSystemFactory.getInstance("Linux","2.0","OS");
        obj1.changeDir();
        obj1.removeDir();
        obj1.printVersionAndArchitecture();
    }
}
