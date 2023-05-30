import java.util.Scanner;
import java.util.StringTokenizer;

public class StringDemo {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int index = 48;
        String input = "The task is very hard and working on it is also hardwork";
        String match = "hard";
        System.out.println("Index of " + input.startsWith("hard", 17));

        boolean flag = input.regionMatches(index, match, 0, 4);

        System.out.println("Index of match word is :" + flag);

        StringTokenizer st = new StringTokenizer("task is very hard", "a");

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken());
        }

        String s1 = "Dileep";
        String s2 = new String(s1);
        String s3 = "DILEEP";

        System.out.println("s1=s2 "+s1.equals(s2));
        System.out.println("s2=s3 "+s2.equals(s3));
        System.out.println("s3=s4 "+s3.equals(s1));
    }

    void formatData(String input, int index, String match) {

        input = input.substring(index, input.length());

        boolean flag = input.contains(match);

        int indexOf = input.indexOf(match);

    }
}
