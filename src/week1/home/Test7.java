package week1.home;

import java.util.Scanner;

/**
 * Created by Nataly on 26.05.2016.
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число №1:");
        int num1 = sc.nextInt();

        System.out.println("Введите число №2:");
        int num2 = sc.nextInt();
        int restdiv = num1 % num2;
        int fulldivision = num1 / num2;
        boolean result = restdiv == 0;

        if(restdiv == 0) {
            System.out.println(result);
            System.out.println ("Целая часть от деления: " + fulldivision + " Остаток: " + restdiv);
        } else {
            System.out.println(result);
            System.out.println ("Целая часть от деления: " + fulldivision + " Остаток: " + restdiv);
        }
    }
}

        /*
        }
        else if (inputnumber < 7) {
            System.out.println("Не делится нацело :'( ");
        }
        else {
            System.out.println("Не делится нацело :'( ");
        } */

