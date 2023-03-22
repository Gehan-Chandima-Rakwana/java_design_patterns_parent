package com.example.factorypattern.example1;

public class OperatingSystemFactory {
    private OperatingSystemFactory(){

    }

    public static OperatingSystem getInstance(String type,String version,String architecture){
        switch (type){
            case "Windows":
                return new WindowsOperatingSystem(version,architecture);
            case "Linux":
                return new LinuxOperatingSystem(version,architecture);
            default:
                throw new IllegalArgumentException("OS not support");
        }
    }
}
