package PRP;

import java.util.HashMap;
import java.util.Map;

public class DigitSumPfUncommonAlphabets {
    public static void main(String[] args) {
        char[] a1 = {'A', 'B', 'C', 'D'};
        char[] b1 = {'B', 'C'};
        System.out.println( findTheSum(a1, b1) );
    }

    public static int findTheSum(char[] input1, char[] input2) {
        HashMap<Character, Integer> map = new HashMap<>();
        int sum =0;
        for (int i = 0; i < input1.length; i++) {
            if (map.containsKey(input1[i])) {
                map.put(input1[i], map.get(input1[i]) + 1);
            } else {
                map.put(input1[i], 1);
            }
        }
        for (int j = 0; j < input2.length; j++) {
            if (map.containsKey(input2[j])) {
                map.put(input2[j], map.get(input2[j]) + 1);
            } else {
                map.put(input2[j], 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                sum = sum + (int) entry.getKey();
            }

        }
       int totSum = 0;
        while (sum>0 || totSum > 9){
            if(sum == 0){
                sum = totSum;
                totSum = 0;
            }
            totSum = totSum + (sum%10);
            sum = sum / 10;
        }
        return totSum;
    }
}
