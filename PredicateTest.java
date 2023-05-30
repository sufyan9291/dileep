package lambda;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String args[]) {

        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println("Predicate test1 resulttt: " + p.test(23));

        Predicate<Integer> p1 = i -> i < 10;
        System.out.println("Predicate test2 resulttt: " + p1.test(23));

        Predicate<Integer> p2 = i -> i < 100;
        System.out.println("Predicate test3 resulttt: " + p2.test(23));

        System.out.println("Predicate test combined resulttt: " + p.and(p1).test(20));

        System.out.println("Predicate test combined resulttt2: " + p1.or(p2).test(101));

        System.out.println("Predicate test negative resulttt2: " + p1.negate().test(20));

        Predicate<Integer> predicate = x -> x >= 99;

        System.out.println("Preddicate check :" + predicate.test(100));


        Predicate<String> p11 = x-> x.equals("Jiya");
        System.out.println("Preddicate check on name:" +  p11.test("Jiya"));


    }

}
