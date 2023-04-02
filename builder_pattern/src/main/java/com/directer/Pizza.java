package com.directer;

public class Pizza {
    private String name;
    private String size;
    private boolean extraCheese;
    private boolean mayonnaise;
    private boolean onion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public boolean isMayonnaise() {
        return mayonnaise;
    }

    public void setMayonnaise(boolean mayonnaise) {
        this.mayonnaise = mayonnaise;
    }

    public boolean isOnion() {
        return onion;
    }

    public void setOnion(boolean onion) {
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
