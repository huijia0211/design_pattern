package com.huijia.principle.liskovsubstitution;

/**
 * @author Admin
 */
public class Square implements Quadrangle{
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }

}
