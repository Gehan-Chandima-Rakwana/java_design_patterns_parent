package com.example.singletonpattern.lazySingleton;

public class main {
    public static void main(String[] args) {
        LazySingleton obj = LazySingleton.getInstance();
        obj.print();
    }
}
