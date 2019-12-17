package com.huijia.principle.dependenceinversion;

public class Huijia {
    private ICourse iCourse;

    public Huijia() {
    }

    public Huijia(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }
    public void studyImoocCourse() {
        iCourse.studyCourse();
    }
}
