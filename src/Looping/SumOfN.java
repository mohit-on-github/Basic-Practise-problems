package Looping;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        int sum=0;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many no's you want to get added?");
        int len = sc.nextInt();
        System.out.println("Enter the no's");
        for (int i=0;i<len;i++) {
             num = sc.nextInt();
             sum= sum+num;
        }
        System.out.println("The sum of entered no is "+sum);
    }
}
