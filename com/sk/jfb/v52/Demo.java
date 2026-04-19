package com.sk.jfb.v52;
import com.sk.jfb.v51.AdvCalc;

public class Demo {
    public static void main (String args[]) {

        VeryAdvCalc calc = new VeryAdvCalc();
        int r1 = calc.add(1,2);
        int r2 = calc.sub(1,2);
        int r3 = calc.multi(2,2);
        int r4 = calc.div(6,2);
        double r5 = calc.pow(4,2);
        System.out.println("r1 : " + r1 + " r2 : "+r2+ " r3 : "+r3+ " r4 : "+r4+ " r5 : "+r5);
    }
}
