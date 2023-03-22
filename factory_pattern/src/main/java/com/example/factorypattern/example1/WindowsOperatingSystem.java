package com.example.factorypattern.example1;

public class WindowsOperatingSystem extends OperatingSystem{
    public WindowsOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir() {
        System.out.println("Change Directory from Windows");
    }

    @Override
    public void removeDir() {
        System.out.println("Remove Directory from Windows");
    }
}
