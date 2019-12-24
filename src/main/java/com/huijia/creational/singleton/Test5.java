package com.huijia.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test5 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<LazySingleton> objectClass = LazySingleton.class;
        Constructor<LazySingleton> constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySingleton newInstance = constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}