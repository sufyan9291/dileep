package collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String args[]) {
        ConcurrentHashMap<Integer, String> cHasmap = new ConcurrentHashMap<>();

        for (int i = 0; i < 100; i++) {
            cHasmap.put(i, "Name_" + i);
        }

        //default iteration

        cHasmap.forEach((k, v) -> {
            System.out.print(Thread.currentThread().getName() + "\t");
            System.out.println(k + "\t" + v);
        });
        System.out.println("----------------------------------");
        //special iteration
        cHasmap.forEach(4, (k, v) -> {
            System.out.print(Thread.currentThread().getName() + "\t");
            System.out.println(k + "\t" + v);
        });


    }

}
