package hacker;


import java.util.Scanner;

public class StdInOut {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int i = scan.nextInt();
        Double d = scan.nextDouble();



        System.out.println("String: " + scan.nextLine());
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
