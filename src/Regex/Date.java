package Regex;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date");
        String date = sc.next();
        sc.close();
        if (date.matches("(0[1-9]|1[0-9]|3[0-1])/(0[1-9]|1[0-2])/(19|2[0-9])[0-9]{2}")) {
            System.out.println(date+" is correct");
        }
        else {
            System.out.println("error");
        }
    }
}
