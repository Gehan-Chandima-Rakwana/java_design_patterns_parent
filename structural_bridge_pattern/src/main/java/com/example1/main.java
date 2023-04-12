package com.example1;

public class main {
    public static void main(String[] args) {
        Shape redShape = new Square(new RedColor());
        redShape.draw("Square");

        Shape blueShape = new Rectangle(new BlueColor());
        blueShape.draw("Rectangle");
    }
}
