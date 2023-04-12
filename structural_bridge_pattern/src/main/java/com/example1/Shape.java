package com.example1;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }
    public abstract void draw(String shape);
}
