package com.huijia.principle.singleresponsibility;

/**
 * @author Admin
 */
public interface ICourse {

    String getCourseName();

    byte[] getCourseVideo();

    void studyCourse();

    void refundCourse();
}
