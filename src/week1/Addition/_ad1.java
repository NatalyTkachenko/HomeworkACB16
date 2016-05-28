package week1.Addition;

import java.util.Scanner;

/**
 * Created by Nataly on 28.05.2016.
 */
public class _ad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону A: ");
        double a = sc.nextDouble();

        System.out.println("Введите сторону B: ");
        double b = sc.nextDouble();

        System.out.println("Введите сторону C: ");
        double c = sc.nextDouble();

        if(a * a == b * b + c * c | b * b == a * a + c * c | c * c == b * b + a * a){
            System.out.println("Треугольник прямоугольный");
        }
        else {
            System.out.println("Треугольник не прямоугольный");
        }
    }
}
