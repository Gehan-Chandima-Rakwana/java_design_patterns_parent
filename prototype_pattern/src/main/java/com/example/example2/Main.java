package com.example.example2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Lion lionKing = new Lion(1,"Lion King","Brown");
        Rabbit bugsBunny = new Rabbit(2, "Bugs Bunny","White");

        Lion cloneLion = (Lion) lionKing.clone();
        Rabbit cloneRabbit = (Rabbit) bugsBunny.clone();

        System.out.println(cloneLion.equals(lionKing));
        System.out.println(cloneRabbit.equals(bugsBunny));

        System.out.println("Address of object"+ lionKing);
        System.out.println("Address of object"+ cloneLion);

        //========================================================================================
        //Implement centralise prototype registry of factory

        AnimalCache animalCache = new AnimalCache();

        Lion lion = (Lion) animalCache.get("cacheLion");
        Rabbit rabbit = (Rabbit) animalCache.get("cacheRabbit");

        Lion cloneLion1 = (Lion) lion.clone();
        Rabbit cloneRabbit1 = (Rabbit) rabbit.clone();

        System.out.println(cloneLion1.equals(lion));
        System.out.println(cloneRabbit1.equals(rabbit));

        System.out.println("Address of object"+ lion);
        System.out.println("Address of object"+ rabbit);

    }
}
