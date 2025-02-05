import java.util.ArrayList;

public class example2 {
    String name;

    public example2(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice"));
        students.add(new Student("Bob"));
        students.add(new Student("Charlie"));

        for (Student student : students) {
            student.display();
        }
    }
}
