package Looping;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to form table");
        int num = sc.nextInt();
        sc.close();
        for (int i=1;i<=10;i++){
            int ans = num * i;
            System.out.println(num+" x "+i+" = "+ans);
        }
    }
}
