package Recursion;

import java.util.Scanner;

public class PrintName {
    void name(int i ,int N){
        if(i>N){
            return;
        }
        System.out.println("Mohit");
        name(i+1,N);
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter no of times u wanna print 'Mohit'");
        int N = sc.nextInt();
        PrintName ob = new PrintName();
        ob.name(1,N);
    }
}
