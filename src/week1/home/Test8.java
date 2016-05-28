package week1.home;

import java.util.Scanner;

/**
 * Created by Nataly on 27.05.2016.
 */
public class Test8 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число №1: ");
        int num1 = sc.nextInt();

        System.out.println("Введите число №2: ");
        int num2 = sc.nextInt();

        int result1 = num1 % 10;
        int result2 = num2 % 10;
        boolean compare = result1 == result2;

        if(result1 == result2){
            System.out.println (compare);
            System.out.println("Остаток от деления № 1: " + result1 + " Остаток от деления №2: " + result2);
        }
        else {
            System.out.println (compare);
            System.out.println("Последние цифры не равны ");
        }
    }
}
