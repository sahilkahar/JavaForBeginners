class A {
    A() {
        System.out.println("Object Created");
    }
    public void show() {
        System.out.println("In show method");
    }
}
public class AnonymousObject {
    public static void main(String[] args) {
        new A();
        new A().show();
    }
}
