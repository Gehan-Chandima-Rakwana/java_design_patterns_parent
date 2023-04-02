package com.directer;

public class main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaDirecter(new VeganPizza()).preparePizza();
        System.out.println(pizza);
        // if class has toString method
        // no need to call pizza.toString()
        // if sout(pizza) will auto call toString method

        Pizza pizza1 = new PizzaDirecter(new VegetarianPizza()).preparePizza();
        System.out.println(pizza1);
    }
}
