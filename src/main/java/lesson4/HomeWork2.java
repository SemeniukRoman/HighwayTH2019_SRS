package lesson4;

import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int max =0;
        int count = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Print a: ");
        a = in.nextInt();
        System.out.print("Print b: ");
        b = in.nextInt();
        System.out.print("Print c: ");
        c = in.nextInt();
        System.out.print("Print d: ");
        d = in.nextInt();

        if (a > b && a > c && a > d ) max = a;
        else if (b > a && b > c && b > d ) max = b;
        else if (c > a && c > b && c > d ) max = c;
        else if (d > a && d > c && d > b ) max = d;
        System.out.println("The biggest number: " + max);
       if (a==b||a==c||a==d||b==c||c==d) count=count++;
        System.out.println("Count biggest numder: " + count);
    }
    }



