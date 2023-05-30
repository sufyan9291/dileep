package lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerTest {
    public static void main(String args[]){

        Consumer<String> c = x-> System.out.println("Welcome with consumer : "+x);
        c.accept("Dileep");

        Supplier<Double> s = ()-> Math.random();
        System.out.println("Supplier to return random number : "+s.get());

        Consumer<Integer> con = x -> System.out.println("2x :"+2*x);

        con.accept(24);

        Consumer<String> cp = x-> System.out.println(x);
        cp.accept("Duaaaaaaaa !");


    }
}
