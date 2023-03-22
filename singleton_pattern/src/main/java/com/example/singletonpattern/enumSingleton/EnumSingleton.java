package com.example.singletonpattern.enumSingleton;

public enum EnumSingleton {
    INSTANCE;

    public void print(){
        System.out.println("This is EnumSingleton");
    }

}
