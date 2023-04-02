package com.example1;

public class Pizza {
    private String name;
    private String size;
    private boolean extraCheese;
    private boolean mayonnaise;
    private boolean onion;

    public Pizza(String name, String size, boolean extraCheese, boolean mayonnaise, boolean onion) {
        this.name = name;
        this.size = size;
        this.extraCheese = extraCheese;
        this.mayonnaise = mayonnaise;
        this.onion = onion;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", extraCheese=" + extraCheese +
                ", mayonnaise=" + mayonnaise +
                ", onion=" + onion +
                '}';
    }
}
