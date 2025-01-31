package com.huijia.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉式单例模式
 */
public class HungrySingleton implements Serializable {
    //private final static HungrySingleton hungrySingleton = new HungrySingleton();
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }

}
