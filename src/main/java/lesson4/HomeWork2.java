package lesson4;

import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int count = 1;

        Scanner in = new Scanner(System.in);

        System.out.print("Print a: ");
        a = in.nextInt();
        System.out.print("Print b: ");
        b = in.nextInt();
        System.out.print("Print c: ");
        c = in.nextInt();
        System.out.print("Print d: ");
        d = in.nextInt();

        if (a==b||a==c||a==d||b==c||b==d||c==d) count=count++;
        else count=count;
        System.out.println("Count biggest numder: " + count);
    }
    }



