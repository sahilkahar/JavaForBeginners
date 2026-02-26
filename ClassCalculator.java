class Calculator {
    int n;
    public int add (int num1, int num2){
        int rs = num1 + num2;
        return rs;
    }
}

public class ClassCalculator {
    public static void main (String args[]) {

        int num1 = 2;
        int num2 = 3;
        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
        System.out.println("result : " + result);
    }
}
