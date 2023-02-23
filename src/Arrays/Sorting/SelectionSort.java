package Arrays.Sorting;

import java.util.Scanner;

public class SelectionSort {
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
        for (int i=0; i<N-1; i++){
            int smallest = i;
            for (int j=i+1;j<N;j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
//            swapping
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        return arr;
    }
}
