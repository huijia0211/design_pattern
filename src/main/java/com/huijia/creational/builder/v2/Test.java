package com.huijia.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.Builder().setCourseName("Java设计模式精讲").setCoursePPT("Java设计模式精讲PPT")
                .setCourseVideo("Java设计模式精讲视频").setCourseArticle("Java设计模式精讲手记").setCourseQA("Java设计模式精讲问答").builder();

        System.out.println(course);
    }
}
