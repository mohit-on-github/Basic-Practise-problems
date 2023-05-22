package Arrays;

import java.util.Scanner;

public class ElementSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency to search");
        String curr = sc.next();
        String[] currArr = {"INR", "USD","YEN","EUR","JPY","CHF","HKD","CAD","CNY"};

        for (int i=0;i<currArr.length;i++){
            if (currArr[i].matches(curr)){
                System.out.println(currArr[i]+" is found at index "+i);
                System.exit(0);
            }
            System.out.println(curr+" is not Found");
        }
    }
}
