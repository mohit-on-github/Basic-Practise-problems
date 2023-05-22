package Misc;

import java.lang.*;
import java.math.*;
import java.util.Scanner;

public class RootsOfQuardraticEqu {
    public static void main(String[] args) throws Exception {
        // ax2+bx+c=0

        System.out.println("Enter the coefficients of quardratic equ ");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int D = (b*b) - (4*a*c);
        if(D < 0){
            throw new Exception("Discriminant cannot be negative");
        }
        else {
            double r1 = (-b + Math.sqrt(D)) / (2 * a);
            double r2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots of Quardraic Equation are " + r1 + " and " + r2);
        }



    }
}
