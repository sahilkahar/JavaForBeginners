public class Switch {
    public static void main (String args[]) {

        int n = 8;

        switch (n) {
            case 1:
            System.out.println("Monday");
                break;
            case 2:
            System.out.println("Tuesday");
                break;
            case 3:
            System.out.println("Wednesday");
                break;
            case 4:
            System.out.println("Thursday");
                break;
            case 5:
            System.out.println("Friday");
                break;
            case 6:
            System.out.println("Saturday");
                break;
            case 7:
            System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input");
        }

        String day = "Sunday";
        switch (day) {
            case "Monday": System.out.println("6am"); break;
            case "Saturday","Sunday": System.out.println("8am"); break;
            default: System.out.println("7am");
        }

        String result = switch (day) {
            case "Monday" -> "6am";
            case "Sunday","Saturday" -> "8am";
            default -> "7am";
        };
        System.out.println("result : " + result);

        String result2 = switch (day) {
            case "Monday" : yield "6am";
            case "Sunday","Saturday" : yield "8am";
            default : yield "7am";
        };
        System.out.println("result2 : " + result2);
    }
}
