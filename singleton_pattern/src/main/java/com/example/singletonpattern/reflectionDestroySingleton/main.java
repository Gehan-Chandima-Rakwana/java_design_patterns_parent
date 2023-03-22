package com.example.singletonpattern.reflectionDestroySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/***
 * This is example for brake singleton class using reflection
 * This will create 2 instances of singleton class
 * for this situation prevent solution is use Enum to archive singleton
 */
public class main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
      /*  LazySingleton obj = LazySingleton.getInstance();
        LazySingleton obj2 = LazySingleton.getInstance();
        obj.print();
        obj2.print();

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode()); */

        // This will get all declared constructors in LazySingleton class as constructors array
        Constructor<?>[] declaredConstructors = LazySingleton.class.getDeclaredConstructors();

        LazySingleton obj = LazySingleton.getInstance();
        LazySingleton obj2 = null;

        // using reflection we can change behaviour of a class at runtime even constructor is privet
        for (Constructor<?> constructors : declaredConstructors) {
            constructors.setAccessible(true);

            //create new object from LazySingleton class and typecast to obj2 that object
            Object object = constructors.newInstance();
            obj2 = (LazySingleton)object;

            break;
        }

        obj.print();
        obj2.print();

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

    }
}
