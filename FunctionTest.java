package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTest {
    public static void main(String args[]) {

        Function<String, Integer> f = s -> s.length();
        Function<String, String> f1 = s -> s.toUpperCase();

        Function<Integer, Integer> f2 = i -> i * i;
        Function<Integer, Integer> f3 = i -> i * i * i;
        Function<Integer, Integer> f4 = i -> i + 5;

        System.out.println("String test  : " + f.apply("Dileep kumar"));
        System.out.println("String test  : " + f1.apply("Dileep kumar"));

        System.out.println("Number test1  : " + f2.apply(2));
        System.out.println("Number test2  : " + f3.apply(5));

        System.out.println("Number combined test  : " + f2.andThen(f3).apply(3));
        System.out.println("Number combined test  : " + f3.andThen(f2.andThen(f4)).apply(3));


        Function<String, Integer> f5 = x -> x.length();
        f5.apply("Chutiya");

        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List square = number.stream().filter(x -> x > 3).map(x -> 2 * x).collect(Collectors.toList());
        square.forEach(e -> {
            System.out.println(e);
        });


    }
}
