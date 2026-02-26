public class Inheritance {
    public static void main(String[] args) {
        AdvCalc calc = new AdvCalc();
        int r1 = calc.add(1,2);
        int r2 = calc.sub(1,2);
        int r3 = calc.multi(1,2);
        int r4 = calc.div(6,2);
        System.out.println(r1+" : "+r2 +" : "+r3+" : "+r4);
    }
}
