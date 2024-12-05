package com.infy.test.InterfaceMethods;

public class Main implements A {
    public static void main(String[] args) {
        A aRef = new Main();
        aRef.abstractMethod();
        aRef.defaultMethod();
        A.staticMethod();

    }

    @Override
    public void abstractMethod() {
        System.out.println("This is the implementation for Abstract Method.");
    }

    @Override
    public void defaultMethod() {
        System.out.println("This is overridden defaultMethod.");
    }

    static void staticMethod(){
        System.out.println("This is a staticMethod");
    }
}


interface A {

    abstract void abstractMethod();

    default void defaultMethod(){
        System.out.println("This is a defaultMethod.");
        privateMethod();
    }

    static void staticMethod(){
        System.out.println("This is a staticMethod");
    }

    private void privateMethod(){
        System.out.println("This is a privateMethod.");
    }
}