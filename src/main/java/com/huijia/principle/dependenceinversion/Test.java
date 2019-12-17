package com.huijia.principle.dependenceinversion;

public class Test {
//    v1
//    public static void main(String[] args) {
//        Huijia huijia = new Huijia();
//        huijia.studyJavaCourse();
//        huijia.studyFECourse();
//    }

//    public static void main(String[] args) {
//        Huijia huijia = new Huijia();
//        huijia.studyImoocCourse(new JavaCourse());
//        huijia.studyImoocCourse(new FECourse());
//    }

    public static void main(String[] args) {
        Huijia huijia = new Huijia(new JavaCourse());
        huijia.studyImoocCourse();
    }
}
