package Regex.NumConversion;

import Regex.NumConversion.Logic;

import java.util.Scanner;

public class RegexPractise {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
         String no = sc.next();
         Logic.no = no;
         Logic.binary();
         Logic.hexaDecimal();
    }

}

