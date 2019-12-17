package com.huijia.principle.dependenceinversion;

public class PythonCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Huijia在学习Python课程");
    }
}
