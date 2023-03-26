package com.example;

public class Main {
    public static void main(String[] args) {
        ApplicationMainFactory mainFactoryWin = new ApplicationMainFactory(new WindowsUIFactory());
        mainFactoryWin.paint();

        ApplicationMainFactory mainFactoryMac = new ApplicationMainFactory(new MacUIFactory());
        mainFactoryMac.paint();
    }
}