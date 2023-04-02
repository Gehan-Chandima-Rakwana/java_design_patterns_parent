package com.directer;

public abstract class PizzaBuilder {
    public abstract void addName();
    public abstract void addSize();
    public abstract void addExtraCheese();
    public abstract void addMayonnaise();
    public abstract void addOnion();
    public abstract Pizza build();
}
