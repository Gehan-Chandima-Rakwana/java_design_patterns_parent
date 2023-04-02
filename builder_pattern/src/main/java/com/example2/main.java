package com.example2;

import com.example1.PizzaBuilder;

public class main {
    public static void main(String[] args) {

        // When we used inner static builder class
        // we can write constructor as private
        // because inner class build method we can access privet constructor
        // like this situation only object can create through builder class
        // but when we use separate class for builder method
        // constructor should be as a public

       Pizza pizza1 = new Pizza.PizzaBuilder()
                        .setExtraCheese(true)
                        .setMayonnaise(true)
                        .setName("Pizza with innerclass")
                       // .setSize("large")
                        .setOnion(true)
                        .build();
        System.out.println(pizza1);
    }
}
