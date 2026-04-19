package com.sk.jfb.v55;

class Calc
{
    public int add (int n1,int n2) {
        return n1+n2;
    }
}

class AdvCalc extends Calc
{
    public int add (int n1,int n2) {
        return n1+n2+1;
    }
}
public class Demo {
    public static void main(String args[]) {
    AdvCalc advCalc = new AdvCalc();
    int r = advCalc.add(1,2);
    System.out.println("r : "+r);
    }
}
