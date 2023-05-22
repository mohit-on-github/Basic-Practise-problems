package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class KthDistinct {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        String[] str = new String[N];
        for(int m=0;m<N;m++){
            str[m] = sc.next();
        }
        int k = sc.nextInt();
        ArrayList<String> distinct = new ArrayList<>();
        for (String y:str){
            for (int i=0;i<N;i++){
                if(y.equals(str[i])){
                    count++;
                    if(count>1){
                        break;
                    }
                }
            }
                if (count==1){
                    distinct.add(y);
                }
        }
        System.out.println(distinct.get(k-1));
    }
}
