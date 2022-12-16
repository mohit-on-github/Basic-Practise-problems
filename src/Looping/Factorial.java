package Looping;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to get n!");
        long n = sc.nextInt();
        System.out.println(n+"! = "+factorial(n));
    }

    public static long factorial(long n) {
        long fact = 1;
        if (n == 0) {
            System.out.println(1);
        }
        for (long i = n; i >= 1; i--) {
            fact = i * fact;
        }
        return fact;
    }
}