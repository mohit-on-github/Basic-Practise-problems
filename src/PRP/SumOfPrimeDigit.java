package PRP;

public class SumOfPrimeDigit {
    public static void main(String[] args) {
        System.out.println(sumOfPrimeDigits(1234561179));
        System.out.println(sumOfPrimeDigits(18471111));
        System.out.println(sumOfPrimeDigits(84696));
        System.out.println(sumOfPrimeDigits(694111));
    }

    public static String sumOfPrimeDigits(int input1){
        String numStr = Integer.toString(input1);
        String newStr = "";
        int sum=0;
        for (int i=0;i<numStr.length();i++){
            int digit = Character.getNumericValue(numStr.charAt(i));
            if(checkPrime(digit) && digit>1){
                newStr = newStr + numStr.charAt(i);
                sum = sum+digit;
            }
        }
        if(newStr.isEmpty()){
            return numStr.charAt(0)+":"+numStr.charAt(numStr.length()-1);
        }
        return newStr+":"+sum;
    }

    public static boolean checkPrime(int digit) {
        boolean flag = true;
        for (int i=2;i<=digit/2;i++){
            if(digit%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }

}
