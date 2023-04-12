package com.example1;

public class Rectangle extends Shape{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw(String shape) {
        color.paint(shape);
    }
}
