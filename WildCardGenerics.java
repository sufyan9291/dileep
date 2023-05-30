package collection;


import java.util.ArrayList;
import java.util.List;

public class WildCardGenerics {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(10);
        double sum = sum(ints);
        System.out.println("Sum of ints=" + sum);

        List<Double> doubles = new ArrayList<>();
        doubles.add(3.0);
        doubles.add(5.0);
        doubles.add(10.7);
        double sumD = sum(doubles);

        System.out.println("Sum of doubles=" + sumD);

        List<String> names = new ArrayList<>();
        names.add("Dileep");
        names.add("Ketty");
        names.add("Dhri");
        printData(names);

    }
// wildcard upper bound

    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }


    public static void printData(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj + "::");
        }
    }

}

