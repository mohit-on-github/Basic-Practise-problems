package Recursion;

import java.util.Scanner;

public class ReverseCounting {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int count=N;

    public static void main(String[] args) {
        System.out.println("Enter the value of N");
        ReverseCounting ob = new ReverseCounting();
        ob.num();
    }
    void num(){
        if(count == 0) {
            return;
        }
        System.out.println(count);
        count--;
        num();
    }
}
