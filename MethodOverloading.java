class Calc {
    public int add (int num1,int num2) {
        return num1 + num2;
    }
    public int add (int num1,int num2, int num3) {
        return num1 + num2 + num3;
    }
}
public class MethodOverloading {
    public static void main (String args[]) {
        Calc obj = new Calc();

        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
    }
}
