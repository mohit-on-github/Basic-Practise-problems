package Hashing;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FrequencyCount {
    public static void frequency(int arr[], int N, int P) {
        // code here
        int[] hash = new int[N + 1];
        for (int i = 0; i < N; i++) {
            hash[arr[i]] = hash[arr[i]] + 1;
        }
        for (int j = 1; j <= N; j++)
            System.out.print(hash[j] + " ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //testcases
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {

            //size of array
            int N = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int P = Integer.parseInt(br.readLine().trim());
            //calling frequncycount() function
            FrequencyCount ob = new FrequencyCount();
            ob.frequency(arr, N, P);

            //printing array elements
            for (int i = 0; i < N; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}
