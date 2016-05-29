package week1.home;

import java.util.Scanner;

/**
 * Created by Nataly on 28.05.2016.
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        int n1 = num % 10; /*вычисление последней цифры*/
        int n2 = num / 100; /* вычисление первой цифры */
        int n3 = (num % 100) / 10; /*нахождение средней цифры*/
        int count = 0;

        if (n2 != 5 & n3 != 5 & n1 == 5
                || n2 == 5 & n3 != 5 & n1 != 5
                || n2 != 5 & n3 == 5 & n1 != 5) {
            System.out.println(count += 1);
            System.out.println("Количество = " + count);
        } else if (n2 != 5 & n3 == 5 & n1 == 5
                || n2 == 5 & n3 != 5 & n1 == 5
                || n2 == 5 & n3 == 5 & n1 != 5) {
            System.out.println(count += 2);
            System.out.println("Количество = " + count);
        } else if (n2 == 5 & n3 == 5 & n1 == 5) {
            System.out.println(count += 3);
            System.out.println("Количество = " + count);
        } else {
            System.out.println(count = 0);
            System.out.println("Количество = " + count);
        }
    }
}
