class Mobile {
    int price;
    String brand;
    static  String phone;

    public void show (){
        System.out.println(price +" : " + brand +" : "+ phone);
    }

    public static void show1() {
        System.out.println("This is a static method : " +phone);
    }

    public static void show2(Mobile obj) {
        //Calling public and static variable from static method
        System.out.println(obj.price +" : " + obj.brand +" : "+ phone);
    }
}
public class StaticVariable {
    public static void main (String args[]) {

        Mobile m1 = new Mobile();
        m1.price = 100;
        m1.brand = "Apple";
        Mobile.phone = "SmartPhone";


        Mobile m2 = new Mobile();
        m2.price = 100;
        m2.brand = "OnePlus";
        Mobile.phone = "Phone";

        m1.show();
        m2.show();

        Mobile.show1();

        Mobile.show2(m1);
    }
}
