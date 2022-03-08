package com.creationalPattern.singletonPattern;

public class SingleObject {

    private static SingleObject instance;

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        if (instance == null) {
            return new SingleObject();
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
