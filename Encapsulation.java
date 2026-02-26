class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String args[]) {
        Human obj = new Human();
        //obj.age = 35;
        //obj.name = "Sahil";
        //System.out.println(obj.name);
        obj.setAge(35);
        obj.setName("Kahar");
        System.out.println(obj.getName() +" : "+obj.getAge());
    }
}
