package com.huijia.principle.interfacesegregation;

public class Bird implements IAnimalAction {
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    /**
     * 有的鸟不会游泳，接口需要细化
     */
    @Override
    public void swim() {

    }
}
