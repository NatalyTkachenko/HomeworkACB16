package week1.home;

import java.util.Scanner;

/**
 * Created by Nataly on 24.05.2016.
 */
public class Test1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текущее время в диапазоне от 0 до 24 (только целые значения!):");
        int time = sc.nextInt();

        if(time >= 9 && time <= 18){
            System.out.println("Я на работе");
        } else {
            System.out.println("Я отдыхаю");
        }
    }
}
