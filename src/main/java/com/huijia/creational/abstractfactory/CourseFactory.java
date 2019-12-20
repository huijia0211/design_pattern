package com.huijia.creational.abstractfactory;

/**
 * 一个工厂对应一个产品族
 */
public interface CourseFactory {
    Video getVideo();

    Article getArticle();
}
