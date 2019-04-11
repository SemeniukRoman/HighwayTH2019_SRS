package lesson4;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца:");
        int month = scanner.nextInt();
        String res;
        switch (month) {
            case 1:
            case 2:
            case 12:
                res = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                res = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                res = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                res = "Autumn";
                break;
            default:
                res = "There is no such month!";
        }
        System.out.println(res);
    }
}
