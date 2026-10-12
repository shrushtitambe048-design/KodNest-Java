package track.D02;

class Parent {
    Parent(int a) {
        super();
        System.out.println("inside parent 1 constructor");
    }

}

class child extends Parent {
    child() {
        super(10);
        System.out.println("inside child 0 constructor");
    }
}

class Main2 {
    public static void main(String[] args) {
        child c1 = new child();
    }
}
