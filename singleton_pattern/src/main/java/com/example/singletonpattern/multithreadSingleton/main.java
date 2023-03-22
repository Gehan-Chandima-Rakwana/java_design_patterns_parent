package com.example.singletonpattern.multithreadSingleton;

import com.example.singletonpattern.lazySingleton.LazySingleton;

public class main {
    public static void main(String[] args) {
        MultithreadedSingleton obj = MultithreadedSingleton.getInstance();
        MultithreadedSingleton obj2 = MultithreadedSingleton.getInstance();
        obj.print();
        obj2.print();

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
    }
}
