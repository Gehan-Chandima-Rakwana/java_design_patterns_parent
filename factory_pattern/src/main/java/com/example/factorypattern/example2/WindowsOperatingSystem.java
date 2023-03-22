package com.example.factorypattern.example2;

public class WindowsOperatingSystem implements OperatingSystem {

    @Override
    public void changeDir() {
        System.out.println("Change Directory on Windows");
    }

    @Override
    public void removeDir() {
        System.out.println("Remove Directory on Windows");
    }
}
