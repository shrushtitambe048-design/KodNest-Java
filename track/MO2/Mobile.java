public class Mobile {
    void EnterPin() {
        System.out.println("Enter the pin");
    }

    Screen unlock() {
        Screen s = new Screen();
        System.out.println("Screen Unlocked");
        return s;

    }
}

class Pin {
}

class Screen {
}

class user {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        Pin p = new Pin();
        Screen s = m.unlock();
        System.out.println(s);
        if (s != null) {
            System.out.println("Mobile is ready to use");
        }
    }
}
