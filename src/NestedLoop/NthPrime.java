package NestedLoop;

public class NthPrime {
    public static void main(String[] args) {
        System.out.println(nthPrime(15));
    }
    public static int nthPrime(int input1){
        int prime = 0;
        for (int i=2;i<=1000;i++){

            if(input1 > 0) {
                if (isPrime(i)) {
                    prime = i;
                    input1--;
                }
            }
            else {
                break;
            }
        }
        return prime;
    }
    public static boolean isPrime(int num){
        boolean flag = true;
        for (int i=2;i<=num/2;i++){
            if(num%i==0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
