package Arrays;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int len = sc.nextInt();
        int[] Arr = new int[len];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < len; i++) {
            Arr[i] = sc.nextInt();
        }
        int max = Arr[0];
        int sec_max = -1;

        for (int x : Arr) {
            if (x > max) {
                sec_max = max;
                max = x;

            } else if (x > sec_max && x < max) {
                sec_max = x;
            } else if (x == max) {
                max = max;
            }
        }
        if (max != sec_max)
            System.out.println(sec_max);
        else
            System.out.println(-1);
    }
}


