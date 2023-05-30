// A Simple Java program to demonstrate
// Overriding and Access-Modifiers

class Parent {
    // private methods are not overridden
    protected void m1() {
        System.out.println("From parent m1()");
    }

    protected static void m2() {
        System.out.println("From parent m2()");
    }
}

class Child extends Parent {
    // new m1() method
    // unique to Child class
    protected void m1() {
        System.out.println("From child m1()");
    }

    // overriding method
    // with more accessibility

    public static void m2() {
        System.out.println("From child m2()");
    }

}

// Driver class
public class Overriding {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.m2();
        Parent obj2 = new Child();
        obj2.m1();

        Child obj3 = new Child();
        obj3.m2();

        Parent obj4 = new Child();
        obj4.m2();
    }
}
