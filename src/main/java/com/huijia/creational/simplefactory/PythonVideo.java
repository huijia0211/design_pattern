package com.huijia.creational.simplefactory;

/**
 * @author Admin
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
