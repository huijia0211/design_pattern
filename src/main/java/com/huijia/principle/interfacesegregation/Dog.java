package com.huijia.principle.interfacesegregation;

/**
 * public class Dog implements IAnimalAction
 */
public class Dog implements ISwimAnimalAction, IEatAnimalAction {
    @Override
    public void eat() {

    }

    /**
     * 狗不会飞，接口需要细化
     */
//    @Override
//    public void fly() {
//
//    }
    @Override
    public void swim() {

    }
}
