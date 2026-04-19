package com.sk.jfb.v57;

public class Demo {

    public static void main(String args[]) {
        A obj = new A();
        //obj.marks;
        obj.show();
        System.out.println("Type                           private protected public default");
        System.out.println("Same class                     yes     yes       yes    yes    ");
        System.out.println("Same package subclass          no      yes       yes    yes    ");
        System.out.println("Same package non-subclass      no      yes       yes    yes    ");
        System.out.println("Different package subclass     no      yes       yes    no     ");
        System.out.println("Different package non-subclass no      no        yes    no     ");
    }
}
