package week1.home;

import java.util.Scanner;

/**
 * Created by Nataly on 26.05.2016.
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();

        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int minus = num1 - num2;

        if (num1 > num2) {
            System.out.println("Разница чисел: " + minus);
        }
        else {
            System.out.println("Сумма чисел: " + sum);
        }
    }
}
