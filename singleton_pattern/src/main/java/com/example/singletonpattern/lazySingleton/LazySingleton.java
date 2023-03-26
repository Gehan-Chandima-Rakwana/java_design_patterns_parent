package com.example.singletonpattern.lazySingleton;

public class LazySingleton {
    //This is static because non-static variables cannot access inside static method(getInstance)
    private static LazySingleton instance = null;

    private LazySingleton(){
    }

    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public void print(){
         System.out.println("This is LazySingleton");
    }
}
