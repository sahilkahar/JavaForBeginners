class Student {
    int rollno;
    String name;
}
public class ArrayOfObject {
    public static void main (String args[]) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Sahil";

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Sid";

        Student students[] = new Student[2];

        students[0] = s1;
        students[1] = s2;

        for (Student s : students) {
            System.out.println("Rollno : "+s.rollno + " Name : " + s.name);
        }
    }
}
