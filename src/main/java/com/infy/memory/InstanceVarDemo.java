package com.infy.memory;

public class InstanceVarDemo {
    int i = 2;

    public static void main(String[] args) {
        InstanceVarDemo demo = new InstanceVarDemo();
        demo.i = 5;
        System.out.println(demo.i);
        InstanceVarDemo demo1 = new InstanceVarDemo();
        System.out.println(demo1.i);


    }
}
