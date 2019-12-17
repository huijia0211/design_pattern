package com.huijia.principle.liskovsubstitution.methodinput;

import java.util.Map;

/**
 * 里氏替换原则，子类方法入参一定要比父类入参宽松
 * @author Admin
 */
public class Child extends Base {
//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类被执行");
//    }

    public void method(Map map) {
        System.out.println("子类Map入参方法被执行");
    }
}
