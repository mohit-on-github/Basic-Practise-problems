package Recursion;

import java.util.Scanner;

public class Nfactorialparameterized {
    static void sum(int i, int add){
        if (i<1){
            System.out.println(add);
            return;
        }
        sum(i-1,add+i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N to get sum of 1 to N");
        int N = sc.nextInt();
        sum(N,0);
    }
}
