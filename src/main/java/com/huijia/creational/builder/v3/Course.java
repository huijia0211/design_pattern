package com.huijia.creational.builder.v3;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder(builderMethodName = "newBuilder")
@Getter
@Setter
@ToString
public class Course {

    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

}
