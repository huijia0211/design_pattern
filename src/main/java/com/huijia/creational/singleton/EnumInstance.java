package com.huijia.creational.singleton;

public enum EnumInstance {
    INSTANCE {
        protected void printTest() {
            System.out.println("Huijia Print Test");
        }
    };
    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public EnumInstance setData(Object data) {
        this.data = data;
        return this;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
