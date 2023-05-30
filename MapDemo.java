package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String args[]) {

        Map<Integer, String> empMap = new TreeMap<>();
        empMap.put(8, "Dileep");
        empMap.put(3, "Dhri");
        empMap.put(5, "jenny");
        empMap.put(4, "Hitler");

        empMap.forEach((k, v) -> System.out.println(k + "\t" + v));

        System.out.println(empMap.getOrDefault(2, "Default Name"));

        empMap.replace(4, "Hitler","John");

      //  empMap.forEach((k, v) -> System.out.println(k + "\t" + v));


    }

}
