package Looping;

import java.util.Scanner;

public class DisplayNos {
    public static void main(String[] args) {
        int rem=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while (num>0) {
            rem = num % 10;
            num = num / 10;
            System.out.println(rem);
        }
    }
}

