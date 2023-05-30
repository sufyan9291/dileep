package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingDemo {

    public static void main(String[] args) {

        // Creating a list of integers
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        System.out.println("The sorted stream is : ");
      //  Collections.sort(list);
      //  list.forEach(i-> System.out.println(i));
        // displaying the stream with elements
        // sorted in natural order

        list.sort((e1,e2)->e1 < e2?1:-1);
        list.forEach(i-> System.out.println(i));
        System.out.println("The sorted stream is : ");
       // list.stream().sorted().forEach(System.out::println);
    }
}
