package week1.home;

import java.util.Scanner;

/**
 * Created by Nataly on 28.05.2016.
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num1 = sc.nextInt();
        int result3 = num1 % 10; /*нахождение остатка для вычисления последней цифры */
        int result1 = num1 / 100; /* нахождение целого от деления на 100 для вычисления первой цифры */
        int result2_1 = num1 / 10; /*нахождение целого от деления числа на 10 для вычисления второй цифры */
        int result2 = result2_1 % 10; /*нахождение остатка от деления на 10, явяляющегося средней цифрой */
        int count = 0;

        if (result1 != 5 & result2 != 5 & result3 == 5
                || result1 == 5 & result2 != 5 & result3 != 5
                || result1 != 5 & result2 == 5 & result3 != 5) {
            System.out.println(count += 1);
            System.out.println("Количество = " + count);
        } else if (result1 != 5 & result2 == 5 & result3 == 5
                || result1 == 5 & result2 != 5 & result3 == 5
                || result1 == 5 & result2 == 5 & result3 != 5) {
            System.out.println(count += 2);
            System.out.println("Количество = " + count);
        } else if (result1 == 5 & result2 == 5 & result3 == 5) {
            System.out.println(count += 3);
            System.out.println("Количество = " + count);
        } else {
            System.out.println(count = 0);
            System.out.println("Количество = " + count);
        }
    }
}
