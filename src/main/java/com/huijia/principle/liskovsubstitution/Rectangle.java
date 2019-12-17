package com.huijia.principle.liskovsubstitution;

/**
 * @author Admin
 */
public class Rectangle implements Quadrangle{
    private long length;
    private long width;

    @Override
    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
