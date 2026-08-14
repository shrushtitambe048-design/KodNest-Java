import java.sql.SQLXML;

public class StudentApplication {
    String name;
    int age;
    double height;

    StudentApplication(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("height: " + height);
    }

    public static void main(String[] args) {
        StudentApplication s1 = new StudentApplication("Rani", 18, 5.5);
        s1.display();
    }

}
