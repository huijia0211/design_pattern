package com.huijia.principle.dependenceinversion;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Huijia在学习Java课程");
    }
}
