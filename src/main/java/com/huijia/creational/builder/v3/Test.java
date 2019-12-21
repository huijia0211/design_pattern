package com.huijia.creational.builder.v3;

public class Test {
    public static void main(String[] args) {
        Course course = Course.newBuilder().courseName("课程名").coursePPT("课程PPT").courseVideo("课程").courseArticle("课程").courseQA("课程").build();
        System.out.println(course);

    }
}
