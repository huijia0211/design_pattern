package com.huijia.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;

/**
 * 里氏替换原则，子类方法返回类型一定要比父类返回类型严格或者相等
 *
 * @author Admin
 */
public class Child extends Base {
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method被执行");
        hashMap.put("message", "子类method被执行");
        return hashMap;
    }
}
