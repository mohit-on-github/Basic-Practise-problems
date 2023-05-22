package Arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();
        int sum=0;
        int[] arr = new int[len];
        System.out.println("enter the elements");
        for (int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        for (int x:arr){
            sum = sum+x;
        }
        System.out.println("sum = "+sum);
    }
}
