import java.util.*;

public class DuplicateChar {
    public static void main(String[] args) {
        System.out.println("Please enter string to find out duplicate char :");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        Set<Character> hs = new HashSet<>();
        List<Character> list = new ArrayList<>();

     /*   for (int i = 0; i < input.length(); i++) {

            char temp = input.charAt(i);

            if (hs.contains(temp)) {
                // System.out.println(temp);
                list.add(temp);
            } else {
                hs.add(temp);
            }
        }  */

        //  list.forEach(e -> System.out.println(e));


        Map<Character, Integer> mp = new HashMap<>();
        int value = 1;
        for (int i = 0; i < input.length(); i++) {
            char tem = input.charAt(i);
            if (mp.containsKey(tem)) {
                int v = mp.get(tem);
                mp.put(tem, ++v);
            } else {
                mp.put(tem, value);
            }

        }

        mp.forEach((x, v) -> {
            if (v > 1)
                System.out.println("key :" + x + "   " + v);
        });
    }
}
