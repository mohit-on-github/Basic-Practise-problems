package Arrays;

import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to insert");
        int ele = sc.nextInt();
        int[] Arr = new int[8];
        Arr[0]= 0;
        Arr[1]= 10;
        Arr[2]= 20;
        Arr[3]= 30;
        Arr[4]= 40;
        Arr[5]= 50;
        Arr[6]= 60;
        System.out.println("Enter the index at which element "+ele+" has to be inserted");
        int i= sc.nextInt();
        for (int j=Arr.length-1;j>=i;j--) {
            Arr[j]=Arr[j-1];
        }
        Arr[i]=ele;
        for (int x:Arr) {
            System.out.println(x);
        }

    }
}
