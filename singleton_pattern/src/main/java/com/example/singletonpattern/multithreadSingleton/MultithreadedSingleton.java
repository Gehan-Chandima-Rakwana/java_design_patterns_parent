package com.example.singletonpattern.multithreadSingleton;

public class MultithreadedSingleton {

    private static MultithreadedSingleton instance = null;

    private MultithreadedSingleton(){
    }

    public static MultithreadedSingleton getInstance(){
        if (instance == null){
            synchronized (MultithreadedSingleton.class){
                if (instance == null){
                    instance = new MultithreadedSingleton();
                }
            }
        }
        return instance;
    }

    public void print(){
        System.out.println("This is MultithreadedSingleton");
    }
}


