package com.example.factorypattern.example1;

public class LinuxOperatingSystem extends OperatingSystem {

    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir() {
        System.out.println("Change Directory from Linux");
    }

    @Override
    public void removeDir() {
        System.out.println("Remove Directory from Linux");
    }
}
