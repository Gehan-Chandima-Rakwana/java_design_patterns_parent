package com.example.singletonpattern.eagerSingleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
    }

    public static EagerSingleton getInstance(){
        return instance;
    }

    public void print(){
        System.out.println("This is EagerSingleton");
    }
}
