package com.example.factorypattern.example2;

public class main {
    public static void main(String[] args){
        OperatingSystemFactory OSF = new OperatingSystemFactory();
        OperatingSystem obj = OSF.getInstance("Windows");
        obj.changeDir();
        obj.removeDir();

    }

}
