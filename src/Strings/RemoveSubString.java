package Strings;

import java.util.Scanner;

public class RemoveSubString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the larger string");
        String s1 = sc.nextLine();
        System.out.println("Enter the substring to be removed from larger string");
        String s2 = sc.next();
        String newStr = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                if (s1.substring(i + 1, i + 1 + s2.length()).equals(s2)) {
//                    newStr = newStr + ' ';
                    i=i+s2.length();
                } else {
                    newStr = newStr+' ';
                }
            } else {
                newStr = newStr + s1.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}