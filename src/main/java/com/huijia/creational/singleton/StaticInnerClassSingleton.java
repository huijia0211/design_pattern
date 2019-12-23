package com.huijia.creational.singleton;

public class StaticInnerClassSingleton {
    /**
     * 核心在于InnerClass的初始化锁
     */
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton() {

    }
}
