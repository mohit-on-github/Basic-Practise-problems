package Looping;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        checkPalindrome(num,num);
        checkArmstrong(num,num);
    }
    public static void checkPalindrome(int rev_no,int NO) {
        if (reverse(rev_no)==NO) {
            System.out.println(rev_no+" "+"is a palindrome");
        }
        else {
            System.out.println(rev_no+" "+"is not a palindrome");
        }
    }

    public static int reverse(int No){
            int temp = 0;
            int rem = 0;
            int count = 0;
            while (No > 0){
            rem = No % 10;
            temp =rem+(temp*10);
            No = No / 10;
            count++;
        }
            System.out.println("There are "+count+" digits in the no");
        System.out.println("The reversed no is "+temp);
        return temp;
    }
    public static int armstrong(int No) {
        int rem = 1;
        int arm=0;
        System.out.println("The digits in this no are");
        while (No>0) {
            rem = No % 10;
            No = No / 10;
            arm = (rem*rem*rem)+arm;
            System.out.println(rem);
        }
        return arm;
    }
    public static void checkArmstrong(int mul_no,int No) {
        if (armstrong(mul_no)!=No) {
            System.out.println("The no is not a armstrong no");
        } else {
            System.out.println("The no is a armstrong no");
        }
    }
}