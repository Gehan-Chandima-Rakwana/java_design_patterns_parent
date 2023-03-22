package com.example.factorypattern.example2;

public class OperatingSystemFactory {
    public OperatingSystem getInstance(String type){
        switch (type){
            case "Windows":
                return new WindowsOperatingSystem();
            case "Linux":
                return new LinuxOperatingSystem();
            default:
                throw new IllegalArgumentException("OS not supported");
        }
    }
}
