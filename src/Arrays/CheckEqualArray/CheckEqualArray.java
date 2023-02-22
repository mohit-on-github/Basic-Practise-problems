package Arrays.CheckEqualArray;

import java.util.Arrays;

public class CheckEqualArray {
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        boolean flag = false;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0; i<N;i++) {
            if(A[i]!=B[i]){
                flag=false;
                break;
            }
            else
            {
                flag=true;
            }
        }
        return flag;
    }
}
