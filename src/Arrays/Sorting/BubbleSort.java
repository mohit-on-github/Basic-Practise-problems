package Arrays.Sorting;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BubbleSort {
//    Time Complexity: O(N^2)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int N = sc.nextInt();
        System.out.println("Enter an array to sort");
        int[] arr = new int[N];
        for (int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int[] sortedArr = sort(arr,N);
        for (int x:sortedArr){
            System.out.print(x+" ");
        }
    }
    static int[] sort(int[] arr, int N){
        int temp = 0;
        for ( int i=0 ; i<N-1 ; i++ ){
            for ( int j=0 ; j<N-1-i ; j++){
                if (arr[j+1]  < arr[j]){
//                    swap
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
