package PRP;

import java.util.Arrays;

public class FundTranfer {
    public static void main(String[] args) {
        int arr1[] = {-1,0,1,0};
        int arr2[] = {1,2,3,-6};
        System.out.println( findMinTransaction(4,arr2));
    }

    public static int findMinTransaction(int input1, int input2[]) {
        int res = -1;
        for (int i=0;i<input1-1;i++) {
            if(input2[i]==0 && input2[i+1]==0){
                res = i;
            }
            input2[i + 1] = input2[i + 1] + input2[i];
            input2[i] = 0;


        }
        for (int x: input2){
            if (x != 0){
                res = -1;
                break;
            }
        }
        return res;
    }
}
