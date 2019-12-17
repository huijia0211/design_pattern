package com.huijia.principle.openclose;

public class JavaDiscountCourse extends JavaCourse implements IDiscountCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getDiscountPrice() {
        return super.getPrice()*0.8;
    }
}
