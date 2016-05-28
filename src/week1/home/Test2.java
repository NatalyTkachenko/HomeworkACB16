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

        if (num1 > num2 && num1 > num3) {
            System.out.println("Наибольшее число №1: " + num1);
        } else if (num1 < num2 & num1 < num3) {
            System.out.println("Наименьшее число №1: " + num1);
        }

        if (num2 > num1 && num2 > num3) {
            System.out.println("Наибольшее число №2: " + num2);
        } else if (num2 < num1 & num2 < num3) {
            System.out.println("Наименьшее число №2: " + num2);
        }

        if (num3 > num2 && num3 > num1) {
            System.out.println("Наибольшее число №3: " + num3);
        } else if (num3 < num2 & num3 < num1) {
            System.out.println("Наименьшее число №3: " + num3);
        }
    }
}

       /* if(number1 > number2){
            if(number1 > number3){
                System.out.println("max is number1 " + number1);
            }
            else{
                if(number3 > number2){
                    System.out.println("max is number3 " + number3);
                }
                else{
                    System.out.println("max is number2 " + number2);
                }
            }
        }
        else{
            if (number2 > number3){
                System.out.println("max is number2 " + number2);
            }
        }

            if(number1 < number2){
                if(number1 < number3){
                System.out.println("min is number1 " + number1);
            }
            else{
                if(number3 < number2){
                    System.out.println("min is number3 " + number3);
                }
                else{
                    System.out.println("min is number2 " + number2);
                }
            }
            }
            else{
            if (number2 < number3){
                System.out.println("min is number2 " + number2);
            }
            }
            }
            }*/

