class A1 {
    public int i;
    protected int j;
}

class B1 extends A1 {

    B1() {
        super.i = 3;
        super.j = 4;
    }

    public void display() {
        System.out.println(i + "  " + j);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        B1 b = new B1();

        b.i = 1;
        b.j = 2;
        b.display();
    }
}
