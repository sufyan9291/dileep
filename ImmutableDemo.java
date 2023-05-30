package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableDemo {
    public static void main(String[] args) {
        List<String> finalList = new ArrayList<>();

        finalList.add("Test1");
        finalList.add("Test2");
        finalList.add("Test3");
        finalList.add("Test4");
        finalList.add("Test5");
        finalList.add("Test6");
        finalList.add("Test7");

        finalList = Collections.unmodifiableList(finalList);

        List<String> list = List.of("Java", "Kotlin", "Groovy");

        list.forEach(e -> System.out.println(e));

        list.add("test8");

        list.forEach(e -> System.out.println(e));

    }
}
