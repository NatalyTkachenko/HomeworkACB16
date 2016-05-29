package week1.home;

import java.util.Scanner;

/**
 * Created by Nataly on 24.05.2016.
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();

        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();

        System.out.println("Введите третье число:");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.println("Наибольшее число №1: " + num1 + " Наименьшее число №3: " + num3);
        } else if (num1 > num2 && num1 > num3 && num2 < num3) {
            System.out.println("Наибольшее число №1: " + num1 + " Наименьшее число №2: " + num2);
        } else if (num1 < num2 && num1 > num3) {
            System.out.println("Наибольшее число №2: " + num2 + " Наименьшее число №3: " + num3);
        } else if (num1 < num2 && num1 < num3 && num2 > num3){
            System.out.println("Наибольшее число №2: " + num2 + " Наименьшее число №1: " + num1);
        } else if (num1 > num2 && num1 < num3){
            System.out.println("Наибольшее число №3: " + num3 + " Наименьшее число №2: " + num2);
        } else if (num1 < num2 && num1 < num3 && num2 < num3){
            System.out.println("Наибольшее число №3: " + num3 + " Наименьшее число №1: " + num1);
        } else {
            System.out.println("Некоторые числа были равны");
        }
    }
}

