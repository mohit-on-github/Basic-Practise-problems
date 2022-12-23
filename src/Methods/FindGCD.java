package Methods;

import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 =sc.nextInt();
        System.out.println("Enter num2");
        int num2 =sc.nextInt();
        sc.close();

        System.out.println("The GCD for "+num1+" and "+num2+" is "+findGCD(num1,num2));

    }

//    Method 1
//    public static int findGCD(int n1 , int n2){
//        int gNUM;
//        int gcd = 1;
//        if(n1>n2){
//            gNUM = n1;
//        }
//        else {
//            gNUM = n2;
//        }
//        for (int i=2;i<=gNUM;i++) {
//            if(n1%i==0 && n2%i==0){
//                gcd=i;
//            }
//        }
//        return gcd;
//    }

    //    Method 2
    public static int findGCD(int m, int n) {
        while (m!=n){
            if (m>n)
                m=m-n;
            else if (m<n)
                n=n-m;
        }
        return m;
    }
}
