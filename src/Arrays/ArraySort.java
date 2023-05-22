package Arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args)
    {

        String[] arr ={"java","python","pascal","smalltalk","ada","basic"};

        Arrays.sort(arr);

        for(String x:arr)
            System.out.println(x);
    }
}
