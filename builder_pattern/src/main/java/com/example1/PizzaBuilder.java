package com.example1;

public class PizzaBuilder {
    private String name;
    private String size;
    private boolean extraCheese;
    private boolean mayonnaise;
    private boolean onion;

    public PizzaBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
        return this;
    }

    public PizzaBuilder setMayonnaise(boolean mayonnaise) {
        this.mayonnaise = mayonnaise;
        return this;
    }

    public PizzaBuilder setOnion(boolean onion) {
        this.onion = onion;
        return this;
    }

    public Pizza build(){
        return new Pizza(name,size,extraCheese,mayonnaise,onion);
    }
}
