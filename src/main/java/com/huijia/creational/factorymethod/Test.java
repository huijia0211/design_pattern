package com.huijia.creational.factorymethod;

/**
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory2 = new PythonVideoFactory();
        VideoFactory videoFactory3 = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
