package Conditionals;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        sc.close();
        System.out.println(year + " " + "is" + " " + leapCheck(year));
    }

    public static String leapCheck(int year) {

        if (year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return "a leap year";
                }
                else {
                    return "not a leap year";
                }
            }
            else{
                return "a leap year";
            }
        }
        else{
            return "not a leap year";
        }
    }
}

