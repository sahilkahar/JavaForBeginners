class TestOverridingP {
    public void show(){
        System.out.println("P In show");
    }
    public void config(){
        System.out.println("P In config");
    }
}
class TestOverridingC extends TestOverridingP {
    //@Override
    public void show(){
        System.out.println("C In show");
    }
}
public class OverridingDemo {
    public static void main (String args[]) {
        TestOverridingC to = new TestOverridingC();
        to.show();
        to.config();
    }
}
