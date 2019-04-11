package lesson4;

import java.util.Scanner;

public class HomeWork1_1 {
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

        int answer = Math.min(Math.min(a, b), Math.min(c, d));
        System.out.println("The smallest number is " + answer);
    }
}
