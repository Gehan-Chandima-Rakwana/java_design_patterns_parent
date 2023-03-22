package com.example.singletonpattern.lazySingleton;

import com.example.singletonpattern.eagerSingleton.EagerSingleton;

public class main {
    public static void main(String[] args) {
        LazySingleton obj = LazySingleton.getInstance();
        LazySingleton obj2 = LazySingleton.getInstance();
        obj.print();
        obj2.print();

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
    }
}
