package Looping;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of terms needed for fibonacci series");
        int n =sc.nextInt();
        int term;
        int term1=0;
        int term2=1;
        System.out.println(term1);
        System.out.println(term2);
        for(int i=0;i<n;i++){

            term=term1+term2;
            System.out.println(term);
            term1=term2;
            term2=term;

        }
    }
}
