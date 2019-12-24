package com.huijia.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test7 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<EnumInstance> objectClass = EnumInstance.class;
        Constructor<EnumInstance> constructor = objectClass.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        EnumInstance instance = EnumInstance.getInstance();
        EnumInstance newInstance = constructor.newInstance("huijia", 666);
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
