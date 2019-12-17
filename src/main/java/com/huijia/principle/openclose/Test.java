package com.huijia.principle.openclose;

public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "Java从零到企业级电商开发", 348.0);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
//        System.out.println("课程ID：" + javaCourse.getId() + "， 课程名称：" + javaCourse.getName() + "， 课程价格：" + javaCourse.getPrice() + "元");
        System.out.println("课程ID：" + javaCourse.getId() + "， 课程名称：" + javaCourse.getName() + "， 课程原价" + javaCourse.getPrice() + "元， 课程折后价格：" + javaCourse.getDiscountPrice() + "元");
    }
}
