package Recursion;

import java.util.Scanner;

public class NfactorialFunctional {
    static int addition(int N){
        if (N<0)
            return 0;
        return N+addition(N-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N to get sum of 1 to N");
        int N = sc.nextInt();
        System.out.println(addition(N));
    }
}
