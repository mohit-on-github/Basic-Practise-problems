package Arrays;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();

        System.out.println("Enter the array for rotation");
        int[] Arr = new int[len];
        for (int i=0;i<len;i++) {
            Arr[i]=sc.nextInt();
        }
        
        int temp = Arr[0];
        for (int j=0;j<=len-2;j++) {
            Arr[j] = Arr[j+1];
        }
        Arr[len-1]=temp;
        for (int x:Arr) {
            System.out.println(x);
        }
    }
}
