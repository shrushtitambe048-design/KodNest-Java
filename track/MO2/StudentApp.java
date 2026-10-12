package track.MO2;

public class StudentApp {
    int roll;
    String name;

    StudentApp(int roll, String name){
        this.roll = roll;
        this.name = name;
    }

    void display(){
        System.out.println(roll);
        System.out.println(name);
    }
}


class StudentApp1 {
    public static void main(String[] args){
       StudentApp s1 = new StudentApp(11, "Arjun");
       StudentApp s2 = new StudentApp(12, "bhavya");
       StudentApp s3 = new StudentApp(11, "Arjun");

       s1.display();
       s2.display();
       s3.display();
    
    System.out.println(s1.equals(s2));
}
}
