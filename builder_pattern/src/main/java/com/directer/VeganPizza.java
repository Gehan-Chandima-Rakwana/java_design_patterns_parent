package com.directer;

public class VeganPizza extends PizzaBuilder{

    private Pizza pizza;

    public VeganPizza() {
       pizza = new Pizza();
    }

    @Override
    public void addName() {this.pizza.setName("VeganPizza");}

    @Override
    public void addSize() {this.pizza.setSize("large");}

    @Override
    public void addExtraCheese() {this.pizza.setExtraCheese(true);}

    @Override
    public void addMayonnaise() {this.pizza.setMayonnaise(true);}

    @Override
    public void addOnion() {this.pizza.setOnion(true);}

    @Override
    public Pizza build() {
        return pizza;
    }
}
