package com.huijia.principle.liskovsubstitution;

/**
 * @author Admin
 */
public class Test {

    /**
     * 在resize()的业务场景下，正方形是不能成为长方形的子类的
     * 长方形类和正方形类不符合里氏替换原则
     * @param rectangle
     */
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width:" + rectangle.getWidth() + ", length:" + rectangle.getLength());
        }
        System.out.println("resize方法结束 width:" + rectangle.getWidth() + ", length:" + rectangle.getLength());
    }

    //    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);
//    }
    public static void main(String[] args) {
        Square square = new Square();
//        square.setLength(10);
//        resize(square);
    }
}
