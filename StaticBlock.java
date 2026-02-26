class Car {

    static String carType;
    int price;
    String brand;

    static {
        carType = "HatchBack";
        System.out.println("In Static Block");
    }

    Car() {
        this.price=100;
        System.out.println("In Construction");
    }

    Car(String brand) {
        this.brand = brand;
    }
}
public class StaticBlock {
    public static void main (String args[]) throws ClassNotFoundException {

        //Car car1 = new Car("TATA");
        //System.out.println(car1);
        //Car car2 = new Car();
        //System.out.println(car2);

        Class.forName("Car");
    }
}
