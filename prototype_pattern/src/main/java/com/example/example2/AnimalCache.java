package com.example.example2;

import java.util.HashMap;
import java.util.Map;

public class AnimalCache {
    private Map<String,Animal> cache = new HashMap<>();

    public AnimalCache(){
        cache.put("cacheLion",new Lion(3,"Lion","Red"));
        cache.put("cacheRabbit",new Rabbit(4,"rabbit","brown"));
    }

    public Animal get(String key) throws CloneNotSupportedException {
        return (Animal) cache.get(key).clone();
    }

}
