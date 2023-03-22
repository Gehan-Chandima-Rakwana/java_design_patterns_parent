package com.example.singletonpattern.enumSingleton;

public class main {
    public static void main(String[] args) {
        EnumSingleton obj = EnumSingleton.INSTANCE;
        EnumSingleton obj2 = EnumSingleton.INSTANCE;

        obj.print();
        obj2.print();

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
    }
}
