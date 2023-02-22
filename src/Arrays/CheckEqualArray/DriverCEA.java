package Arrays.CheckEqualArray;


//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

public class DriverCEA {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        long t=sc.nextLong();

        while(t-->0)
        {
            int n=sc.nextInt();
            long arr[]=new long[n];
            long brr[]=new long[n];

            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextLong();
            }

            for(int i=0;i<n;i++)
            {
                brr[i]=sc.nextLong();
            }
            CheckEqualArray ob = new CheckEqualArray();
            System.out.println(ob.check(arr,brr,n)==true?"1":"0");


        }
    }
}
// } Driver Code Ends


//TEST CASE
//1
//5
//1 5 24 5 35
//5 24 5 1 35
