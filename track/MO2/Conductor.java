public class Conductor {
    void collect(money m) {
        System.out.println("Money collected by Conductor");
    }

    Ticket give() {
        Ticket t = new Ticket();
        System.out.println("Ticket issued");
        return t;

    }
}

class money {

}

class Ticket {

}

class passenger {

    public void main(String[] args) {
        Conductor c = new Conductor();
        money m = new money();
        c.collect(m);
        Ticket t = c.give();
        System.out.println(t);
        if (t != null) {
            System.out.println("Ticket collected");
        }

    }
}
