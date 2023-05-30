package collection;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] array = new String[10];

        array[2] = "30";
        array[4] = "50";

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}


interface I1 {

    int i = 0;

    void m1();

}

abstract class A {
    int i;

    abstract void m2();
}
