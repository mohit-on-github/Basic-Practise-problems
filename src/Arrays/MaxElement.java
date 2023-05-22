package Arrays;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int len = sc.nextInt();
        int[] Arr = new int[len];
        System.out.println("enter the elements of the array");
        for (int i=0;i<len;i++){
            Arr[i]=sc.nextInt();
        }
        int max = Arr[0];
        for (int x:Arr) {
            if(x>max){
                max=x;
            }
        }
        System.out.println("Maximum element is "+max);
    }
}
