package lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HomeWork4 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        if(s1.equals(s2)){
            System.out.println("Тезки");
        } else System.out.println("Имена разные");
            }
        }


