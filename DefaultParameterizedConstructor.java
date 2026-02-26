class Person {
    private int age;
    private String name;

    Person() //Default Constructor
    {
        this.age= 35;
        this.name = "Sahil";
    }

    Person(int age,String name) //Parameterized Constructor
    {
        this.age = age;
        this.name = name;
    }
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
public class DefaultParameterizedConstructor {
    public static void main (String args[]) {
        Person person = new Person();
        System.out.println(person.getName() +" : "+person.getAge());

        Person person2 = new Person(33,"Sid");
        System.out.println(person2.getName() +" : "+person2.getAge());
    }
}
