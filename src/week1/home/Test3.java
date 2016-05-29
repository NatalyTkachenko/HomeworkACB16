package week1.home;

import java.util.Scanner;

/**
 * Created by Nataly on 25.05.2016.
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int inputnumber = sc.nextInt();
        int divrest = inputnumber % 7;

        if (divrest == 0) {
            System.out.println("Удвоенное значение введенного числа: " + inputnumber * inputnumber);
        } else {
            System.out.println("Не делится нацело :'( ");
        }
    }
}