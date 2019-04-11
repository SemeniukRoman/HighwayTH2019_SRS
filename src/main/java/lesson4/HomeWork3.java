package lesson4;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int min = 0;
        int max = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Print a: ");
        a = in.nextInt();
        System.out.print("Print b: ");
        b = in.nextInt();
        System.out.print("Print c: ");
        c = in.nextInt();
        System.out.print("Print d: ");
        d = in.nextInt();
        System.out.print("Print e: ");
        e = in.nextInt();

        if (a < b && a < c && a < d && a < e) min = a;
        else if (b < a && b < c && b < d && b < e) min = b;
        else if (c < a && c < b && c < d && c < e) min = c;
        else if (d < a && d < c && d < b && d < e) min = d;
        else if (e < a && e < c && e < d && e < b) min = e;
        System.out.println("The smallest number: " + min);

        if (a > b && a > c && a > d && a > e) max = a;
        else if (b > a && b > c && b > d && b > e) max = b;
        else if (c > a && c > b && c > d && c > e) max = c;
        else if (d > a && d > c && d > b && d > e) max = d;
        else if (e > a && e > c && e > d && e > b) max = e;
        System.out.println("The biggest number: " + max);
    }
}