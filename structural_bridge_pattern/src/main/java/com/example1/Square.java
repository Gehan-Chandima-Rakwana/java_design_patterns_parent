package com.example1;

public class Square extends Shape{

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw(String shape) {
        color.paint(shape);
    }
}
