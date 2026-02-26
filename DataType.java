public class DataType
{
    public static void main (String args[])
    {
        int num1 = 3;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);

        byte byteVar = 127;
        System.out.println(byteVar);

        short shortVAr = 558;
        long longVar = 558l;
        float floatVar = 5.8f;
        double doubleVar = 5.8;

        char charVar = 'c';

        boolean boolVar = true;

        // type casting
        byte b = 125;
        System.out.println(b);

        int intVar = b;
        System.out.println(intVar);

        int intVar1 = 257;
        byte byteVar1 = (byte) intVar1;

        System.out.println(byteVar1);

        float floatVar1 = 5.6f;
        int intVar2 = (int) floatVar1;

        System.out.println(intVar2);

        byte byteVar3 = 20;
        byte byteVar2 = 30;

        int  result1 = byteVar3 * byteVar2;
        System.out.println(result1);

        long longVar1 = 999999999999999L;

        int intVar3 = (int) longVar1;
        System.out.println(intVar3);
    }
}
