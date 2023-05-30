package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CharCountInString {

    static void characterCount(String inputString) {

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char[] strArray = inputString.toCharArray();
        String output = "";

        //checking each char of strArray

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        System.out.println(charCountMap);

        Iterator it = charCountMap.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<Character, Integer> ele = (Map.Entry<Character, Integer>) it.next();

            output += ele.getKey();
            output += ele.getValue();

        }


        System.out.println(output);

    }

    public static void main(String[] args) {
        //   characterCount("Java J2EE Java JSP J2EE");

        characterCount("abcdsadsas");

        //characterCount("Done And Gone");
    }
}
