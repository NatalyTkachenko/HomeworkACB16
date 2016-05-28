package week1.home;

import java.util.Scanner;

/**
 * Created by Nataly on 27.05.2016.
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();

        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;


        if (sum >= 11 && sum <= 19) {
            System.out.println("Сумма в диапазоне: " + sum);
        }
        else {
            System.out.println("Сумма не в диапазоне");
        }
    }
}
