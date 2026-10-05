package track.D02;

class Parent1 {
    int a = 10;
}

class Child1 extends Parent1 {
    int a = 20;

    void disp2() {
        System.out.println("Parents a: " + super.a);
        System.out.println("Childs a: " + a);
    }
}

class Main {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.disp2();
    }
}
