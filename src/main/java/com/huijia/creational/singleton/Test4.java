package com.huijia.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test4 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<StaticInnerClassSingleton> objectClass = StaticInnerClassSingleton.class;
        Constructor<StaticInnerClassSingleton> constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton newInstance = constructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
