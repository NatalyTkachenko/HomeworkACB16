package week1.Addition;

import java.util.Scanner;

/**
 * Created by Nataly on 27.05.2016.
 */
public class _ad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int number1 = sc.nextInt();
        int resultpow1 = number1 * number1 * number1;

        System.out.println("Введите второе число:");
        int number2 = sc.nextInt();
        int resultpow2 = number2 * number2 * number2;

        System.out.println("Введите третье число:");
        int number3 = sc.nextInt();
        int resultpow3 = number3 * number3 * number3;

        if(number1 >= 0){
            System.out.println("Первое число в кубе: " + resultpow1);
        }
        else if (number1 < 0) {
            System.out.println("Обнуленное число 1 = " + 0);
        }

        if(number2 >= 0){
            System.out.println("Второе число в кубе: " + resultpow2);
        }
        else if (number2 < 0) {
            System.out.println("Обнуленное число 2 = " + 0);
        }

        if(number3 >= 0){
            System.out.println("Третье число в кубе: " + resultpow3);
        }
        else if (number2 < 0) {
            System.out.println("Обнуленное число 3 = " + 0);
        }
    }
}
        /* if(number2 >= 0){
            System.out.println("Число в кубе 2: " + number2);
        }
             if(number3 > 0) number3 = number3 * number3 * number3;{
            System.out.println("Число в кубе 3: " + number3);
        }
             else(number3 < 0)number3 = 0;{
                System.out.println("Число 3 обнулено: " + number3);
            }
                 }
             }*/
