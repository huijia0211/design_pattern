package com.huijia.principle.dependenceinversion;

public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Huijia在学习FE课程");
    }
}
