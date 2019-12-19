package com.huijia.creational.factorymethod;
/**
 * 实现创建接口的子类
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
