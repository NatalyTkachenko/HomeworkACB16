package week1.home;

import java.util.Scanner;

/**
 * Created by Nataly on 26.05.2016.
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        double num = sc.nextDouble();

        if(num >= 0 && num <= 1) {
            System.out.println("Число " + num + " входит в диапазон");
        } else {
            System.out.println("Число " + num + " не входит в диапазон");
        }
    }
}