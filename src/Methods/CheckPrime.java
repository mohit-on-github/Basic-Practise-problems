package Methods;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no to check whether it is prime");
        int n = sc.nextInt();
        CheckPrime cpObj = new CheckPrime();
        System.out.println("The no "+n+" is "+cpObj.checkPrime(n) +" no");
    }
    public String checkPrime(int num){
        boolean flag=false;
        for (int i=2;i<num;i++) {

            if (num % i == 0) {
                flag = false;
                break;
            }
            else {
                flag = true;
            }
        }
        if (flag)
            return "a prime";
        else
            return "not a prime";
    }
}
