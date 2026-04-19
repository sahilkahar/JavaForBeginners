package com.sk.jfb.v54;

class A {
    public A() {
        System.out.println("In A");
    }

    public A(int a) {
        System.out.println("In A int");
    }
}

class B extends A {
    public B() {
        System.out.println("In B");
    }

    public B(int b) {
        //super(b);
        this();
        System.out.println("In B int");
    }
}

public class Demo {
    public static void main (String args []) {
        //B b = new B();
        B b = new B(1);
    }
}
