public class LogicalOperator {
    public static void main (String args[]) {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x > y && a < b;

        System.out.println(result);
        System.out.println("-----------");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println("-----------");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println("-----------");
        System.out.println(!false);
        System.out.println(!true);

    }
}
