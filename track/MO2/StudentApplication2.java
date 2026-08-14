public class StudentApplication2 {
    String name;
    int age;
    double height;

    StudentApplication2() {
        name = "Anu";
        age = 19;
        height = 5.0;
    }

    StudentApplication2(String name) {
        this.name = name;
    }

    StudentApplication2(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }

    public static void main(String[] args) {
        StudentApplication2 s2 = new StudentApplication2();
        s2.display();

        StudentApplication2 s3 = new StudentApplication2("Shri");
        s3.display();

        StudentApplication2 s1 = new StudentApplication2("Shloka", 18, 5.5);
        s1.display();
    }
}