package com.example1;

public class main {
    public static void main(String[] args) {

        Pizza pizza1 = new PizzaBuilder()
                .setName("test1")
                .setExtraCheese(true)
                .setMayonnaise(false)
                .setOnion(true)
                .setSize("small")
                .build();
        System.out.println(pizza1);
    }
}
