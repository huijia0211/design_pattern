package com.huijia.creational.builder.v2;

public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    public Course(Builder builder) {
        this.courseName = builder.courseName;
        this.coursePPT = builder.coursePPT;
        this.courseVideo = builder.courseVideo;
        this.courseArticle = builder.courseArticle;
        this.courseQA = builder.courseQA;
    }

    public String getCourseName() {
        return courseName;
    }

    public Course setCourseName(String courseName) {
        this.courseName = courseName;
        return this;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public Course setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
        return this;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public Course setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
        return this;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public Course setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
        return this;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public Course setCourseQA(String courseQA) {
        this.courseQA = courseQA;
        return this;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public static class Builder {
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public Builder setCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public Builder setCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public Builder setCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public Builder setCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public Builder setCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course builder() {
            return new Course(this);
        }
    }
}
