package Recursion;

import java.util.Scanner;

public class Palindrome {
    static boolean swap(String S, int i){
        if(i>S.length()/2){
            return true;
        }
        if(S.charAt(i) != S.charAt(S.length()-i-1)) {
            return false;
        }
        return swap(S,i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome");
        String inpStr = sc.next();
        System.out.println("palindrome: "+swap(inpStr,0));
    }
}

