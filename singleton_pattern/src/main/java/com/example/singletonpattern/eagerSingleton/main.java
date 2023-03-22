package com.example.singletonpattern.eagerSingleton;

public class main {
    public static void main(String[] args) {
        EagerSingleton obj = EagerSingleton.getInstance();
        EagerSingleton obj2 = EagerSingleton.getInstance();
        obj.print();
        obj2.print();

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
    }
}
