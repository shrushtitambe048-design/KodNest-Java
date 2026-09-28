package Array.M05;

public class Book {
    private int pageNum;

    public void set(int x) {
        pageNum = x;

    }

    public void get() {
        System.out.println(pageNum);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.set(-100);
        b.get();

    }

}
