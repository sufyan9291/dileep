import java.math.BigDecimal;

class AB {
    public static int x;
    public static int y;

    public AB(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class OverriddingDemo {

    void m1(String obj) {
        System.out.println("Inside String");
    }

    void m1(Object obj) {
        System.out.println("Insidde Object");
    }

    void m1(Integer obj) {
        System.out.println("Insidde Integer");
    }

    public static void main(String[] args) {

        OverriddingDemo objdemo1 = new OverriddingDemo();
        OverriddingDemo objdemo = null;

        objdemo1.m1(objdemo);
      //   objdemo1.m1(null);// ambigious

        double d1 = 0.3;
        double d2 = 0.2;

        double d3 = d1 - d2;

        BigDecimal b1 = new BigDecimal(0.3);
        BigDecimal b2 = new BigDecimal(0.2);

        BigDecimal b3 = b1.subtract(b2);

      //  System.out.println(d3 + "-" + b3);

        AB ab = new AB(4, 5);
        AB ab1 = new AB(8, 9);

        System.out.println(ab.x + "   " + ab.y);

    }

}
