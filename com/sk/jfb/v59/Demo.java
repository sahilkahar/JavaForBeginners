package com.sk.jfb.v59;

class A {
public void show () {
    System.out.println("In A show");
}
}

class B extends A {
    public void show () {
        System.out.println("In B show");
    }
}

public class Demo {
    public static void main (String args[]) {
        // B obj = new B();
        // This is method overridding also call dynamic method dispatch
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
    }
}
