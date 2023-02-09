package Recursion;

import java.util.Scanner;

public class BackTracing1toN {
    static void repeat(int i){
        if(i<1){
            return;
        }
        repeat(i-1);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N to print 1 to N");
        int N = sc.nextInt();
        repeat(N);
    }
}
