package lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HomeWork4 {
    public static void main(String[] args) throws Exception {

        //Ввод данных с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        // Сравнение имен
        if(s1.equals(s2)){
            System.out.println("Имена идентичны");
        } else if(s1 != s2){
            if(s1.length() == s2.length()){
                System.out.println("Длины имен равны");
            }
        }
    }
}
