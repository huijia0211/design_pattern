package com.huijia.creational.singleton;

/**
 * 懒汉式单例模式
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton() {
        //LazySingleton无法避免反射
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
