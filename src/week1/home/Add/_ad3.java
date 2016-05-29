package week1.home.Add;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Nataly on 28.05.2016.
 */
public class _ad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = sc.nextInt();
        int n3 = number % 10;
        int n2 = (number % 100) / 10;
        int n1 = number / 100;
        boolean compare;

        compare = (n1 == n2 & n1 == n3 & n2 == n3);
        System.out.println(compare);

        /*compare = (n1 == n2 || n1 == n3 || n2 == n3);
        System.out.println(compare);*/
    }
}
