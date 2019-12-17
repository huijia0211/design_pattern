package com.huijia.principle.demeter;

public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
//        Course不是Boss的朋友
//        List<Course> courseList = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            courseList.add(new Course());
//        }
        teamLeader.checkNumberOfCourse();
    }
}
