class A {
    A(){
        System.out.println("A Default");
    }
}
class B extends A {
    B(){
        System.out.println("B Default");
    }

}
public class ThisAndSuper {
    public static void main (String args[]) {
        //System.out.println("Hi");
        //A a = new A();
        B b = new B();
    }
}
