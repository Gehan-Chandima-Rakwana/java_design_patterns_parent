package com.directer;

public class VegetarianPizza extends PizzaBuilder{
    private Pizza pizza;

    public VegetarianPizza(){
        pizza = new Pizza();
    }

    @Override
    public void addName() {
        this.pizza.setName("VegetarianPizza");
    }

    @Override
    public void addSize() {
        this.pizza.setSize("large");
    }

    @Override
    public void addExtraCheese() {
        this.pizza.setExtraCheese(false);
    }

    @Override
    public void addMayonnaise() {
        this.pizza.setMayonnaise(true);
    }

    @Override
    public void addOnion() {
        this.pizza.setOnion(false);
    }

    @Override
    public Pizza build() {
        return pizza;
    }
}
