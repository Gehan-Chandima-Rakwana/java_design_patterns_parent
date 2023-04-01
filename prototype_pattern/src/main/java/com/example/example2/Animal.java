package com.example.example2;

import java.util.Objects;

public abstract class Animal implements Cloneable{
    private int id;
    private String name;
    private String color;

    public Animal() {
    }

    public Animal(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return id == animal.id &&
                Objects.equals(name,animal.name) &&
                Objects.equals(color, animal.color);
    }
}
