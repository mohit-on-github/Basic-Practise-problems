package InWords;

import java.util.Scanner;

public class NoInWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int  num = sc.nextInt();
        int rev_num = reverse(num);
        convertInWords(rev_num);
    }
    public static void convertInWords(int num) {
        int rem=0;
        while (num>0) {
            rem = num % 10;
            num=num/10;
            switch (rem){
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }
    public static int reverse(int No) {
        int rem=0;
        int temp=0;
        while (No>0){
            rem = No%10;
            No=No/10;
            temp = rem+(temp*10);

        }
        return temp;
    }

}
