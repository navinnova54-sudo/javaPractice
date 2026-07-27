package Day11;

class AccessExample {

    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class ModifierDemo1 {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        obj.display();
    }
}
