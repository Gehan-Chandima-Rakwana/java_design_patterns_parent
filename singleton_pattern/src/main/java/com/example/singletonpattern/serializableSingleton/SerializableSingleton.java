package com.example.singletonpattern.serializableSingleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private static Serializable instance = null;

    private SerializableSingleton(){

    }

    public static SerializableSingleton getInstance(){
        if (instance == null){
            instance = new SerializableSingleton();
        }
        return (SerializableSingleton) instance;
    }

    protected Object readResolve(){
        return instance;
    }

    public void print(){
        System.out.println("This is LazySingleton");
    }
}
