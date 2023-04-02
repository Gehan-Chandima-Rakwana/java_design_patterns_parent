package com.directer;

public class PizzaDirecter {
    private PizzaBuilder pizzaBuilder;

    public PizzaDirecter(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza preparePizza(){
        pizzaBuilder.addName();
        pizzaBuilder.addSize();
        pizzaBuilder.addExtraCheese();
        pizzaBuilder.addMayonnaise();
        pizzaBuilder.addOnion();
        return pizzaBuilder.build();
    }
}
