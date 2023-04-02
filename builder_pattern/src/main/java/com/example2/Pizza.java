package com.example2;

import com.example1.PizzaBuilder;

public class Pizza {
    private String name;
    private String size;
    private boolean extraCheese;
    private boolean mayonnaise;
    private boolean onion;

    // can implement getters and setters also
    private Pizza(String name, String size, boolean extraCheese, boolean mayonnaise, boolean onion) {
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

    public static class PizzaBuilder{
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
}
