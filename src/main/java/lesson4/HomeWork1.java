package lesson4;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Print a: ");
        a = in.nextInt();
        System.out.print("Print b: ");
        b = in.nextInt();
        System.out.print("Print c: ");
        c = in.nextInt();
        System.out.print("Print d: ");
        d = in.nextInt();

        if ((a < b) && (a < c) && (a < d)) {
            System.out.println("The smallest number is a");
        } else if ((b < a) && (b < c) && (b < d)) {
            System.out.println("The smallest number is b");
        } else if ((c < a) && (c < b) && (c < d)) {
            System.out.println("The smallest number is c");
        } else if ((d < a) && (d < b) && (d < c)) {
            System.out.println("The smallest number is d");
        }
    }
}
