public class Array {
    public static void main (String args[]) {
        int num [] = {1,0,5,5};
        num [1] = 2;
        System.out.println(num[1]);

        int num1 [] = new int[4];
        num1[0] = 1;
        num1[1] = 0;
        num1[2] = 5;
        num1[3] = 5;

        for (int i = 0;i <= 3;i++) {
            System.out.println(num1[i]);
        }
    }
}
