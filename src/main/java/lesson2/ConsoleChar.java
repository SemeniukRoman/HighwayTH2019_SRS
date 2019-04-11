package lesson2;

import java.io.PrintWriter;
import java.util.Scanner;

public class ConsoleChar {
    public static void main(String args[]) {
        Scanner sca= new Scanner(System.in);
        System.out.println("Print char value:");
        char ch=sca.next().charAt(0); // считывает только первый введенный символ
        int b = (char) ch;
        System.out.println("int value: " + b);

        System.out.print("Print int value: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char c=(char)n;
        System.out.println("char value: " + c);
    }
}
