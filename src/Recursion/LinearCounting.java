package Recursion;

import java.util.Scanner;

public class LinearCounting {
    int count=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = sc.nextInt();
        LinearCounting obj = new LinearCounting();
        obj.num(N);
    }
     void num(int N){
        if(count == N){
            return;
        }
        count++;
        System.out.println(count);
        num(N);
    }
}
